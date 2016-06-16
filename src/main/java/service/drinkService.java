package service;

import socialdrink.Drink;
import socialdrink.Ingredient;

import java.util.List;

/**
 * Created by carlosmorais on 11/06/16.
 */
public interface drinkService {

    public void addDrink(Drink drink);
    public void getDrinkById(int id);


    public Ingredient[] getListIngredient();

    public void addDrink(String nome, String descricao, int tempo, int tipoBebida, int quantidade, List<String> passos, List<Integer> ingredientes, List<String> quantidades);
}
