package service;

import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import socialdrink.*;


import java.util.List;

/**
 * Created by carlosmorais on 11/06/16.
 */

@Service("userService")
public class drinkServiceImpl implements drinkService{
    private Facade facade = new Facade();

    public void addDrink(Drink drink) {

    }

    public Drink getDrinkById(int id) {
        try {
            return this.facade.getDrinkByORMID(id);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Ingredient[] getListIngredient() {
        try {
            return facade.listIngredientByCriteria(new IngredientCriteria());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addDrink(String nome, String descricao, int tempo, int tipoBebida, int quantidade, List<String> passos, List<Integer> ingredientes, List<String> quantidades) {
        try {
            Drink drink = facade.createDrink();
            drink.setName(nome);
            drink.setDescription(descricao);
            drink.setTimeToPrepate(tempo);
            drink.setTypeOfDrink(facade.getDrinkTypeByORMID(tipoBebida));
            drink.setYeld(quantidade);

            //passos de preparação
            int count = 1;
            for (String passo : passos) {
                Step step = facade.createStep();
                step.setNumber(++count);
                step.setDescription(passo);
                drink.steps.add(step);
            }

            //ingredientes e quantidades da bebida
            count=0;
            for (int ingrediente : ingredientes) {
                DrinkIngredient drinkIngredient = facade.createDrinkIngredient();
                drinkIngredient.setIngredient(facade.getIngredientByORMID(ingrediente));
                drinkIngredient.setAmount(quantidades.get(count));
                drink.ingredients.add(drinkIngredient);
                count++;
            }

            System.out.println("New Drink: "+drink.toString());

            User user = facade.getUserByORMID(1);
            user.drinks.add(drink);
            facade.save(user);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    public Drink[] getAllDrinks() {
        try {
            return this.facade.listDrinkByCriteria(new DrinkCriteria());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }


}
