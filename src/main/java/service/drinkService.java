package service;

import org.springframework.web.multipart.MultipartFile;
import socialdrink.Drink;
import socialdrink.Ingredient;
import socialdrink.Step;

import java.util.List;

/**
 * Created by carlosmorais on 11/06/16.
 */
public interface drinkService {

    public void addDrink(Drink drink);
    public Drink getDrinkById(int id);


    public Ingredient[] getListIngredient();

    public int addDrink(String nome, String descricao, int tempo, int tipoBebida, int quantidade, List<String> passos, List<Integer> ingredientes, List<String> quantidades);

    public Drink[] getAllDrinks();

    public Step[] getDrinkSteps(int drinkId);

    void setDrinkProfile(int drinkId, MultipartFile file);

    void addPhotosToAlbum(int drinkId, MultipartFile[] photosFiles);
}
