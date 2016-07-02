package service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import model.Movie;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by carlosmorais on 02/07/16.
 */


@Service("moviesService")
public class MoviesServiceImpl {
    private String url = "http://localhost:8080/SocialDrink/movie";

    public List<Movie> getListMoviesByDrinkID(int drinkId){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                "http://localhost:8080/SocialDrink/movie",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>() {});
        return response.getBody();
    }


    /* Teste */
    public static void main(String args[]){
     RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                "http://localhost:8080/SocialDrink/movie",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>() {});
        List<Movie> movies = response.getBody();
        for (Movie m : movies) {
            System.out.println(m.toString());
        }
        /*
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Movie> response = restTemplate.getForEntity(
                "http://localhost:8080/SocialDrink/movie",
                Movie.class);

        System.out.println(response.getBody().toString());
        */
    }

}
