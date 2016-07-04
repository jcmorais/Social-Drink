package api;

import model.Canil;
import model.Movie;
import model.Movies;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlosmorais on 02/07/16.
 */

@RestController
public class movieExample {
    @RequestMapping(value = "/canil", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Canil>> getCanilList() {
        Canil canil = new Canil();
        canil.setName("Pet Club");
        canil.setId(1);
        canil.setAddress("Rua Nova de Santa Cruz, Braga");
        canil.setCity("Guimaraes");
        canil.setDescription("We aim to help the animals!");
        canil.setEmail("email@email.pt");;
        canil.setSchedule("From 9am to 8 pm on week days & From 9am to 1pm on weekends");
        canil.setPhone(123456789);
        canil.setOpening_date("10010010101010101010101");
        canil.setLat(41.157944);
        canil.setLng(-8.629105);
        List<Canil> list = new ArrayList<>();
        list.add(canil);
        return new ResponseEntity<List<Canil>>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Movies> getMovieList() {
        Movie movie = new Movie();
        movie.setId(12);
        movie.setTitle("Rei Leão");
        movie.setImg_path("https://image.tmdb.org/t/p/w396/z09QAf8WbZncbitewNk6lKYMZsh.jpg");
        movie.setOverview("um filme muita fixe!");
        movie.setYear(2001);
        movie.setGenres(null);
        List<Movie> list = new ArrayList<>();
        list.add(movie);
        Movies movies = new Movies();
        movies.setMovies(list);
        return new ResponseEntity<Movies>(movies, HttpStatus.OK);
    }
}
