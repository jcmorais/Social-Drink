package service;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Comment;
import socialdrink.*;
import socialdrink.dao.AlbumDAO;
import socialdrink.impl.AlbumDAOImpl;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
            facade.listStepByCriteria(criteria);
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
    public void addEvaluation(int drinkId, String comment, int value) {
        try {
            Evaluation evaluation = facade.createEvaluation();
            evaluation.setDate(new Date());
            evaluation.setText(comment);
            evaluation.setValue(value);
            evaluation.setUser(facade.getConsumerByORMID(1));
            Drink drink = facade.getDrinkByORMID(drinkId);
            drink.evaluation.add(evaluation);
            facade.save(drink);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }


    public int addDrink(String nome, String descricao, int tempo, int tipoBebida, int quantidade, List<String> passos, List<Integer> ingredientes, List<String> quantidades) {
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
            photo.setFilePath(File.separator+"images"+File.separator+"drink"+File.separator+"default.jpeg");
            photo.setName("default.jpeg");
            drink.setPhoto(photo);

            //album
            Album album = facade.createAlbum();
            drink.setAlbum(album);

            //passos de preparação
            int count = 1;
            /*
            for (String passo : passos) {
                Step step = facade.createStep();
                step.setNumber(count++);
                step.setDescription(passo);
                drink.steps.add(step);
            }
            */
            for (count =1; count < (passos.size()/2); ) {
                String passo = passos.get(count);
                Step step = facade.createStep();
                step.setNumber(count++);
                step.setDescription(passo);
                drink.steps.add(step);
            }

            //ingredientes e quantidades da bebida
            count=0;
            //TODO não percebo pq que os ingredientes vêm duplicados....
            /*
            for (int ingrediente : ingredientes) {
                DrinkIngredient drinkIngredient = facade.createDrinkIngredient();
                drinkIngredient.setIngredient(facade.getIngredientByORMID(ingrediente));
                drinkIngredient.setAmount(quantidades.get(count));
                drink.ingredients.add(drinkIngredient);
                count++;
            }
            */
            for (String q : quantidades) {
                DrinkIngredient drinkIngredient = facade.createDrinkIngredient();
                drinkIngredient.setIngredient(facade.getIngredientByORMID(ingredientes.get(count)));
                drinkIngredient.setAmount(q);
                drink.ingredients.add(drinkIngredient);
                count++;
            }

            System.out.println("New Drink: "+drink.toString());
            User user = facade.getUserByORMID(1);
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


}
