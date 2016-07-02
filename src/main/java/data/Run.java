package data;

import org.orm.PersistentException;
import socialdrink.*;
import socialdrink.dao.*;
import socialdrink.impl.*;

import java.util.Date;

/**
 * Created by carlosmorais on 11/06/16.
 */
public class Run {

    public static class Data
    {
        private Facade facade = new Facade();

    public void createIngredients() throws PersistentException {


        //1
        Ingredient ingredient = facade.createIngredient();
        ingredient.setName("vodka");
        facade.save(ingredient);

            //2
            ingredient = facade.createIngredient();
            ingredient.setName("limão");
            facade.save(ingredient);

            //3
            ingredient = facade.createIngredient();
            ingredient.setName("gelo");
            facade.save(ingredient);

            //4
            ingredient = facade.createIngredient();
            ingredient.setName("bacardi");
            facade.save(ingredient);

            //5
            ingredient = facade.createIngredient();
            ingredient.setName("7up");
            facade.save(ingredient);

            //6
            ingredient = facade.createIngredient();
            ingredient.setName("coca-cola");
            facade.save(ingredient);

            //7
            ingredient = facade.createIngredient();
            ingredient.setName("groselha");
            facade.save(ingredient);

            //8
            ingredient = facade.createIngredient();
            ingredient.setName("agua tónica");
            facade.save(ingredient);

            //9
            ingredient = facade.createIngredient();
            ingredient.setName("gin");
            facade.save(ingredient);

            //10
            ingredient = facade.createIngredient();
            ingredient.setName("safari");
            facade.save(ingredient);

            //11
            ingredient = facade.createIngredient();
            ingredient.setName("laranja");
            facade.save(ingredient);

            //12
            ingredient = facade.createIngredient();
            ingredient.setName("sumo de laranja");
            facade.save(ingredient);

            //13
            ingredient = facade.createIngredient();
            ingredient.setName("sumo de limão");
            facade.save(ingredient);

            //14
            ingredient = facade.createIngredient();
            ingredient.setName("sumo de ananas");
            facade.save(ingredient);

            //15
            ingredient = facade.createIngredient();
            ingredient.setName("café");
            facade.save(ingredient);

            //16
            ingredient = facade.createIngredient();
            ingredient.setName("leite condensado");
            facade.save(ingredient);

        //17
        ingredient = facade.createIngredient();
        ingredient.setName("água");
        facade.save(ingredient);

        //18
        ingredient = facade.createIngredient();
        ingredient.setName("morango");
        facade.save(ingredient);

        }


        public void createCountriesAndCities() throws PersistentException {

            City city = facade.createCity();
            city.setName("Guimaraes");

            Country country = facade.createCountry();
            country.setName("Portugal");
            country.cities.add(city);
            facade.save(country);
        }


        public void createConsumer() throws PersistentException {
            Address address = facade.createAddress();
            address.setCity(facade.getCityByORMID(1));
            address.setPostalCode("4800-091");
            address.setStreet("rua do padre amaro");

            Photo photo = facade.createPhoto();
            photo.setName("default");
            photo.setFilePath("/images/");

            Consumer consumer = facade.createConsumer();
            consumer.setBirthday(new Date());
            consumer.setDescription("utilizador de teste");
            consumer.setFirstname("carlos");
            consumer.setLastname("morais");
            consumer.setSex("masc");
            consumer.setPassword("12345");
            consumer.setProfession("operário de construção cívil");
            consumer.setEmail("jcmorais93@gmail.com");
            consumer.setPhoto(photo);
            facade.save(consumer);
        }

        public void createTypesOfDrink() throws PersistentException {
            DrinkType type = facade.createDrinkType();
            type.setName("álcool");
            facade.save(type);

            type = facade.createDrinkType();
            type.setName("sem álcool");
            facade.save(type);
        }

        public void createDriks() throws PersistentException {

            Photo photo = facade.createPhoto();
            photo.setFilePath("/images/drink/default.jpeg");
            photo.setName("default.jpeg");

            Consumer consumer = facade.getConsumerByORMID(1);
            photo = facade.getPhotoByORMID(1);

            //novo drink
            DrinkType type = facade.getDrinkTypeByORMID(1);
            DrinkDAO drinkDAO = new DrinkDAOImpl();
            Drink drink = drinkDAO.createDrink();
            drink.setTypeOfDrink(type);
            drink.setName("Halls Mix");
            drink.setYeld(1);
            drink.setDescription("Esse drink quem me ensinou foi um amigo na faculdade, a primeira vez que eu provei foi numa choppada. Quem nunca experimentou deveria experimentar! Drink Espetacular que reune o sabor da batida da fruta com a sensação de refrescância da halls! Além de ser um drink barato, tem um sabor diferenciado dos demais!");
            drink.setTimeToPrepate(6);
            drink.setRating(0);
            drink.setRatingVotes(0);
            photo = facade.createPhoto();
            photo.setName("default.jpeg");
            photo.setFilePath("/images/drink/default.jpeg");
            drink.setPhoto(photo);
            DrinkIngredient drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(16));
            drinkIngredient.setAmount("1 lata");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(17));
            drinkIngredient.setAmount("100 ml");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(1));
            drinkIngredient.setAmount("250 ml");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(3));
            drinkIngredient.setAmount("6 cubos");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(18));
            drinkIngredient.setAmount("3");
            drink.ingredients.add(drinkIngredient);
            Step step = facade.createStep();
            step.setNumber(1);
            step.setDescription("Leve as balas halls ao fogo com água para que ela não grude na panela.");
            drink.steps.add(step);
            step = facade.createStep();
            step.setNumber(2);
            step.setDescription("Mexa as balas na panela até que derretam por completo formando uma calda.");
            drink.steps.add(step);
            step = facade.createStep();
            step.setNumber(3);
            step.setDescription("Coloque a calda feita com bala halls em um liquidificador junto com os morangos e o leite condensado.");
            drink.steps.add(step);
            step.setNumber(4);
            step.setDescription("Acrescente a Vodka e bata tudo..");
            drink.steps.add(step);
            AlbumDAO albumDAO = new AlbumDAOImpl();
            Album album = albumDAO.createAlbum();
            drink.setAlbum(album);
            consumer.drinks.add(drink);
            facade.save(consumer);

            //novo drink
            type = facade.getDrinkTypeByORMID(1);
            drinkDAO = new DrinkDAOImpl();
            drink = drinkDAO.createDrink();
            drink.setTypeOfDrink(type);
            drink.setName("Vodka de Morango");
            drink.setYeld(1);
            drink.setDescription("bebida mt loka");
            drink.setTimeToPrepate(4);
            drink.setRating(0);
            drink.setRatingVotes(0);
            photo = facade.createPhoto();
            photo.setName("default.jpeg");
            photo.setFilePath("/images/drink/default.jpeg");
            drink.setPhoto(photo);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(2));
            drinkIngredient.setAmount("3");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(1));
            drinkIngredient.setAmount("100 ml");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(1));
            drinkIngredient.setAmount("100 ml");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(6));
            drinkIngredient.setAmount("um bocadinho");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(9));
            drinkIngredient.setAmount("2 copinhos");
            drink.ingredients.add(drinkIngredient);
            step = facade.createStep();
            step.setNumber(1);
            step.setDescription("descrição algo detalhada do passo 1");
            drink.steps.add(step);
            step = facade.createStep();
            step.setNumber(2);
            step.setDescription("descrição intermédia, com alguns detalhes relevantes");
            drink.steps.add(step);
            step = facade.createStep();
            step.setNumber(3);
            step.setDescription("descrição fina, bom apetite!!");
            drink.steps.add(step);
            album = facade.createAlbum();
            drink.setAlbum(album);
            consumer.drinks.add(drink);
            facade.save(consumer);

            //novo Drink
            type = facade.getDrinkTypeByORMID(1);
            drink = facade.createDrink();
            drink.setTypeOfDrink(type);
            drink.setName("Safari Cola");
            drink.setYeld(1);
            drink.setDescription("uma descricao desta bebida pode ser um conjunto de texto completamente aleatorio e sem qualquer sentido l" +
                    "ogico");
            drink.setTimeToPrepate(4);
            drink.setRating(0);
            drink.setRatingVotes(0);
            photo = facade.createPhoto();
            photo.setName("default.jpeg");
            photo.setFilePath("/images/drink/default.jpeg");
            drink.setPhoto(photo);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(2));
            drinkIngredient.setAmount("3");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(1));
            drinkIngredient.setAmount("100 ml");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(1));
            drinkIngredient.setAmount("100 ml");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(6));
            drinkIngredient.setAmount("um bocadinho");
            drink.ingredients.add(drinkIngredient);
            drinkIngredient = facade.createDrinkIngredient();
            drinkIngredient.setIngredient(facade.getIngredientByORMID(9));
            drinkIngredient.setAmount("2 copinhos");
            drink.ingredients.add(drinkIngredient);
            step = facade.createStep();
            step.setNumber(1);
            step.setDescription("descrição algo detalhada do passo 1");
            drink.steps.add(step);
            step = facade.createStep();
            step.setNumber(2);
            step.setDescription("descrição intermédia, com alguns detalhes relevantes");
            drink.steps.add(step);
            step = facade.createStep();
            step.setNumber(3);
            step.setDescription("descrição fina, bom apetite!!");
            drink.steps.add(step);
            albumDAO = new AlbumDAOImpl();
            album = albumDAO.createAlbum();
            drink.setAlbum(album);
            consumer.drinks.add(drink);
            facade.save(consumer);
        }

}



    public static void main(String args[]) throws PersistentException {

        Data data = new Data();

        data.createIngredients();

        data.createTypesOfDrink();

        data.createCountriesAndCities();

        data.createConsumer();

        data.createDriks();
    }
}
