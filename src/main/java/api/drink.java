package api;

import model.DrinkRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.drinkService;
import socialdrink.Drink;

import java.util.List;

/**
 * Created by carlosmorais on 20/06/16.
 */


@RestController
public class drink {

    @Autowired
    private drinkService drinkService;

    @RequestMapping(value = "/api/bestdrinks", method = RequestMethod.GET )
    public ResponseEntity<List<DrinkRepresentation>> getBestDrinks() {
        return new ResponseEntity<List<DrinkRepresentation>>(drinkService.getBestDrinkRepresentation(0), HttpStatus.OK);
    }

    @RequestMapping(value = "/api/bestdrinks/comalcool", method = RequestMethod.GET )
    public ResponseEntity<List<DrinkRepresentation>> getBestDrinksAlcool() {
        return new ResponseEntity<List<DrinkRepresentation>>(drinkService.getBestDrinkRepresentation(1), HttpStatus.OK);
    }

    @RequestMapping(value = "/api/bestdrinks/semalcool", method = RequestMethod.GET )
    public ResponseEntity<List<DrinkRepresentation>> getBestDrinksSemAlcool() {
        return new ResponseEntity<List<DrinkRepresentation>>(drinkService.getBestDrinkRepresentation(2), HttpStatus.OK);
    }


    @RequestMapping(value = "/api/drinks", method = RequestMethod.GET )
    public ResponseEntity<Drink[]> list() {
        System.out.println("passa A");
        Drink[] drinks = drinkService.getAllDrinks();
        return new ResponseEntity<Drink[]>(drinks, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/drink/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Drink> getUser(@PathVariable("id") int id) {
        System.out.println("Fetching Drink with id " );
        Drink drink = drinkService.getDrinkById(id);
        if (drink == null) {
            System.out.println("Drink with id " + id + " not found");
            return new ResponseEntity<Drink>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Drink>(drink, HttpStatus.OK);
    }
}
