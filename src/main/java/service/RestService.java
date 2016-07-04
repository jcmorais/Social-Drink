package service;

import model.Canil;
import model.Movie;
import model.Movies;

import java.util.List;

/**
 * Created by carlosmorais on 02/07/16.
 */
public interface RestService {
    Movies getListMoviesByDrinkID(int drinkId);

    List<Canil> getListCanil();
}
