package service;

import model.DrinkRepresentation;
import org.springframework.web.multipart.MultipartFile;
import socialdrink.Drink;
import socialdrink.Evaluation;
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

    Evaluation addEvaluation(int drinkId, String comment, int value);

    Drink[] getBestDrinks(int tipo);

    List<DrinkRepresentation> getBestDrinkRepresentation(int tipo);

    boolean isFavoriteDrink(int drinkId);
}
