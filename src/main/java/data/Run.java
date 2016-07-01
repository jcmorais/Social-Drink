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


    public static void main(String args[]) throws PersistentException {

        Facade facade = new Facade();

        //criar ingredientes

        Ingredient ingredient = facade.createIngredient();
        ingredient.setName("vodka");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("morango");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("limão");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("gelo");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("bacardi");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("7up");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("coca-cola");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("groselha");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("agua tónica");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("gin");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("safari");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("laranja");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("sumo de laranja");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("sumo de limão");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("sumo de ananas");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("grão de café");;
        facade.save(ingredient);

        ingredient = facade.createIngredient();
        ingredient.setName("PananaPaEsseCu");;
        facade.save(ingredient);



        //cidades e paises
        CityDAO cityDAO = new CityDAOImpl();
        City city = cityDAO.createCity();
        city.setName("Guimaraes");

        CountryDAO countryDAO = new CountryDAOImpl();
        Country country = countryDAO.createCountry();
        country.setName("Portugal");
        country.cities.add(city);
        countryDAO.save(country);


        AddressDAO addressDAO = new AddressDAOImpl();
        Address address = addressDAO.createAddress();
        address.setCity(city);
        address.setPostalCode("4800-091");
        address.setStreet("rua do padre amaro");

        PhotoDAO photoDAO = new PhotoDAOImpl();
        Photo photo = photoDAO.createPhoto();
        photo.setName("default");
        photo.setFilePath("/images/");

        ConsumerDAO consumerDAO = new ConsumerDAOImpl();
        Consumer consumer = consumerDAO.createConsumer();

        consumer.setBirthday(new Date());
        consumer.setDescription("utilizador de teste");
        consumer.setFirstname("carlos");
        consumer.setLastname("morais");
        consumer.setSex("masc");
        consumer.setPassword("12345");
        consumer.setProfession("operário de construção cívil");
        consumer.setEmail("jcmorais93@gmail.com");
        consumer.setPhoto(photo);
        consumerDAO.save(consumer);



        //cria tipos de bebida
        DrinkTypeDAO drinkTypeDAO = new DrinkTypeDAOImpl();
        DrinkType type = drinkTypeDAO.createDrinkType();
        type.setName("álcool");
        drinkTypeDAO.save(type);

        type = drinkTypeDAO.createDrinkType();
        type.setName("sem álcool");
        drinkTypeDAO.save(type);

        photo = photoDAO.createPhoto();
        photo.setName("foto da vodka");
        photo.setFilePath("/path/path/filename");


        consumer = consumerDAO.getConsumerByORMID(1);
        photo = photoDAO.getPhotoByORMID(1);



        //adicionar drink
        type = drinkTypeDAO.getDrinkTypeByORMID(1);
        DrinkDAO drinkDAO = new DrinkDAOImpl();
        Drink drink = drinkDAO.createDrink();
        drink.setTypeOfDrink(type);
        drink.setName("Vodka de Morango");
        drink.setYeld(1);
        drink.setDescription("bebida mt loka");
        drink.setTimeToPrepate(4);
        drink.setRating(0);
        drink.setRatingVotes(0);
        photo = photoDAO.createPhoto();
        photo.setName("default.jpeg");
        photo.setFilePath("/images/drink/default.jpeg");
        drink.setPhoto(photo);
        DrinkIngredient drinkIngredient = facade.createDrinkIngredient();
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
        Step step = facade.createStep();
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
        AlbumDAO albumDAO = new AlbumDAOImpl();
        Album album = albumDAO.createAlbum();
        drink.setAlbum(album);
        consumer.drinks.add(drink);



        //adicionar drink
        type = drinkTypeDAO.getDrinkTypeByORMID(1);
        drinkDAO = new DrinkDAOImpl();
        drink = drinkDAO.createDrink();
        drink.setTypeOfDrink(type);
        drink.setName("Safari Cola");
        drink.setYeld(1);
        drink.setDescription("uma descricao desta bebida pode ser um conjunto de texto completamente aleatorio e sem qualquer sentido l" +
                "ogico");
        drink.setTimeToPrepate(4);
        drink.setRating(0);
        drink.setRatingVotes(0);
        photo = photoDAO.createPhoto();
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
        consumerDAO.save(consumer);


    }
}
