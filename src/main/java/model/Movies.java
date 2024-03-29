package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlosmorais on 04/07/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movies {
    private List<Movie> movies;

    public Movies(){
        this.movies = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
