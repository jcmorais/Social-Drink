package controller;

import model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.RestService;

/**
 * Created by carlosmorais on 04/07/16.
 */


@Controller
@RequestMapping(value = "/service")
public class RestController {
    @Autowired
    RestService restService;

    @RequestMapping(value="/canis", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView canis(ModelAndView model) {
        model.addObject("canis", restService.getListCanil());
        model.setViewName("service/canis");
        return model;
    }

    @RequestMapping(value = "/movies/{drinkId}", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView movies(ModelAndView model,
                        @PathVariable("drinkId") int drinkId) {

        Movies movies = restService.getListMoviesByDrinkID(drinkId);
        if(movies.getMovies().size()==0)
            model.addObject("semmovies","yes");
        else
            model.addObject("semmovies","no");
        model.setViewName("service/movies");
        return model;
    }

}
