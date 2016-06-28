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
        drink.setName("vodka de morango");
        drink.setYeld(1);
        drink.setDescription("bebida mt loka");
        drink.setTimeToPrepate(4);
        photo = photoDAO.createPhoto();
        photo.setName("default.jpeg");
        photo.setFilePath("/images/drink/default.jpeg");
        drink.setPhoto(photo);
        AlbumDAO albumDAO = new AlbumDAOImpl();
        Album album = albumDAO.createAlbum();

        drink.setAlbum(album);
        //drinkDAO.save(drink);
        consumer.drinks.add(drink);

        consumerDAO.save(consumer);


    }
}
