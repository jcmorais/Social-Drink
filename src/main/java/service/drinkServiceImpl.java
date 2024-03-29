package service;

import model.DrinkRepresentation;
import org.hibernate.Criteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import socialdrink.*;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
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


    public Step[] getDrinkSteps(int drinkId){
        try {
            StepCriteria criteria = new StepCriteria();
            criteria.add(Restrictions.eq("drinkid", drinkId));
            criteria.addOrder(Order.asc("number"));
            return facade.listStepByCriteria(criteria);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public void setDrinkProfile(int drinkId, MultipartFile photoFile) {
        if (!photoFile.isEmpty()) {
            try {
                byte[] bytes = photoFile.getBytes();
                String photoName = photoFile.getOriginalFilename();

                // Creating the directory to store file
                /*String rootPath = System.getProperty("catalina.home");
                System.out.println("PATH: "+rootPath + File.separator + "tmpFiles");*/
                File dir = new File(System.getProperty("jboss.server.data.dir")+"/images/drink/"+drinkId);
                System.out.println("PATH:::::"+System.getProperty("jboss.server.data.dir")+"/images/drink/"+drinkId);

                if (!dir.exists())
                    dir.mkdirs();

                // Create the file on server
                String[] aux = photoFile.getOriginalFilename().split("\\.");
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + "profile."+aux[aux.length-1]);
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();

                System.out.println(photoName+" guardado com sucesso!");
                System.out.println("PATH:"+dir.getAbsolutePath());

                //save de path on the DB
                Drink drink = facade.getDrinkByORMID(drinkId);
                Photo photo = drink.getPhoto();
                photo.setFilePath("/images/drink/"+drinkId+"/profile."+aux[aux.length-1]);
                photo.setName("profile."+aux[aux.length-1]);
                drink.setPhoto(photo);

                facade.save(drink);
            } catch (Exception e) {
            }
        }


    }

    public void addPhotosToAlbum(int drinkId, MultipartFile[] photosFiles) {
        for (int i=0;i<photosFiles.length;i++) {
            if (!photosFiles[i].isEmpty()) {
                try {
                    byte[] bytes = photosFiles[i].getBytes();
                    String photoName = photosFiles[i].getOriginalFilename();
                    Photo photo = this.facade.createPhoto();
                    facade.save(photo);

                    File dir = new File(System.getProperty("jboss.server.data.dir") + "/images/drink/" + drinkId+"/album");

                    if (!dir.exists())
                        dir.mkdirs();

                    // Create the file on server
                    String[] aux = photosFiles[i].getOriginalFilename().split("\\.");
                    File serverFile = new File(dir.getAbsolutePath()
                            + File.separator + photo.getID() +"."+ aux[aux.length - 1]);
                    BufferedOutputStream stream = new BufferedOutputStream(
                            new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();

                    System.out.println(photoName + " guardado com sucesso!");
                    System.out.println("PATH:" + dir.getAbsolutePath());

                    //save de path on the DB

                    photo.setFilePath("/images/drink/" + drinkId+"/album" + "/" + photo.getID() +"."+ aux[aux.length - 1]);
                    photo.setName(photo.getID()+"." + aux[aux.length - 1]);
                    Drink drink = facade.getDrinkByORMID(drinkId);
                    drink.getAlbum().fotos.add(photo);

                    //drink.setPhoto(photo);
                    facade.save(drink);
                } catch (Exception e) {
                }
            }
        }
    }

    @Override
    public Evaluation addEvaluation(int userId, int drinkId, String comment, int starts) {
        Evaluation evaluation=null;
        try {
            evaluation = facade.createEvaluation();
            evaluation.setDate(new Date());
            evaluation.setText(comment);
            evaluation.setValue(starts);
            Consumer consumer = facade.getConsumerByORMID(userId);
            evaluation.setUser(consumer);
            Drink drink = facade.getDrinkByORMID(drinkId);
            drink.evaluation.add(evaluation);
            drink.setRating(drink.getRating()+ starts);
            drink.setRatingVotes(drink.getRatingVotes()+1);
            facade.save(drink);
            //Event
            EventEval event = facade.createEventEval();
            event.setEvaluation(evaluation);
            event.setDrink(drink);
            consumer.events.add(event);
            facade.save(consumer);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return evaluation;
    }


    public int addDrink(int userId, String nome, String descricao, int tempo, int tipoBebida, int quantidade, List<String> passos, List<Integer> ingredientes, List<String> quantidades) {
        int drinkId=0;
        try {
            Drink drink = facade.createDrink();
            drink.setName(nome);
            drink.setDescription(descricao);
            drink.setTimeToPrepate(tempo);
            drink.setTypeOfDrink(facade.getDrinkTypeByORMID(tipoBebida));
            drink.setYeld(quantidade);

            //default photo
            Photo photo = this.facade.createPhoto();
            photo.setFilePath("/images/drink/default.jpeg");
            photo.setName("default.jpeg");
            drink.setPhoto(photo);

            //album
            Album album = facade.createAlbum();
            drink.setAlbum(album);

            //stars
            drink.setRating(0);
            drink.setRatingVotes(0);

            //passos de preparação
            int count = 1;
            for (String passo : passos) {
                Step step = facade.createStep();
                step.setNumber(count++);
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

            User user = facade.getUserByORMID(userId);

            if(user instanceof Consumer) {
                EventDrink event = facade.createEventDrink();
                event.setDrink(drink);
                ((Consumer) user).events.add(event);
            }

            user.drinks.add(drink);
            facade.save(user);
            drinkId = drink.getID();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return drinkId;
    }

    public Drink[] getAllDrinks() {
        try {
            return this.facade.listDrinkByCriteria(new DrinkCriteria());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return null;
    }


    public Drink[] getBestDrinks(int tipo){
        DrinkCriteria criteria = null;
        Drink drinks[] = null;
        try {
            criteria = new DrinkCriteria();
            if(tipo==1)
                criteria.add(Restrictions.eq("typeOfDrink", facade.getDrinkByORMID(1)));
            if(tipo==2)
                criteria.add(Restrictions.eq("typeOfDrink", facade.getDrinkByORMID(2)));
            criteria.addOrder(Order.desc("rating"));
            criteria.setMaxResults(10);
            drinks = facade.listDrinkByCriteria(criteria);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return drinks;
    }




    public List<DrinkRepresentation> getBestDrinkRepresentation(int tipo){
        List<DrinkRepresentation> best = new ArrayList<>();
        for (Drink drink : getBestDrinks(tipo)) {
            best.add(new DrinkRepresentation(drink));
        }
        return best;
    }

    @Override
    public boolean isFavoriteDrink(int drinkId) {
        boolean res = false;
        try {
            Drink drink = facade.getDrinkByORMID(drinkId);
            if(facade.getConsumerByORMID(1).favoriteDrinks.contains(drink))
                res = true;
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return res;
    }


}
