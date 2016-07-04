package service;

import model.Canil;
import model.Movie;
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
    private String urlMovies = "http://localhost:8080/SocialDrink/movie";
    private String urlFamilyMovies = "http://localhost:8080/SocialDrink/movie";

    //Canil
    private String urlCanil = "http://localhost:8080/SocialDrink/canil";

    public List<Movie> getListMoviesByDrinkID(int drinkId){
        String url=urlMovies;
        try {
            if(facade.getDrinkByORMID(drinkId).getTypeOfDrink().getID()!=1)
                url=urlFamilyMovies;
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Movie>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movie>>() {});
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
