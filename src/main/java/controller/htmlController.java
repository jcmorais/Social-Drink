package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.RestService;

/**
 * Created by jpp on 10/06/16.
 */

@Controller
public class htmlController {
    //Só para testar o html quando estivermos a fazer as paginas

    @Autowired
    RestService restService;

    @RequestMapping("/teste")
    public ModelAndView index(ModelAndView model) {
        model.addObject("movies", restService.getListMoviesByDrinkID(1));
        model.addObject("canis", restService.getListCanil());
        model.setViewName("/drink/teste");
        return model;
    }
}
