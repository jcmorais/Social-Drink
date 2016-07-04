package service;

import model.Canil;
import model.Movie;

import java.util.List;

/**
 * Created by carlosmorais on 02/07/16.
 */
public interface RestService {
    List<Movie> getListMoviesByDrinkID(int drinkId);

    List<Canil> getListCanil();
}
