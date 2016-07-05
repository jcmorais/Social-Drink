package service;

import model.Canil;
import model.Movie;
import model.Movies;
import org.orm.PersistentException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import socialdrink.Facade;

import java.util.List;

/**
 * Created by carlosmorais on 02/07/16.
 */


@Service("restService")
public class RestServiceImpl implements RestService {
    Facade facade = new Facade();

    //Movies
    private String urlMovies = "http://reel-ea1516.herokuapp.com/api/v1/genres/";
    private String urlFamilyMovies = "http://reel-ea1516.herokuapp.com/api/v1/genres/";

    //Canil
    private String urlCanil = "http://localhost:8080/SocialDrink/canil";

    public Movies getListMoviesByDrinkID(int drinkId){
        String url=urlMovies+drinkId;
        try {
            if(facade.getDrinkByORMID(drinkId).getTypeOfDrink().getID()!=1)
                url=urlFamilyMovies+drinkId;
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Movies> response = null;
        try {
            response = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<Movies>() {
                    });
        }
        catch (Exception e){
            return new Movies();
        }
        return response.getBody();
    }




    public List<Canil> getListCanil(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Canil>> response = restTemplate.exchange(
                urlCanil,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Canil>>() {});
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
