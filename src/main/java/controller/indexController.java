package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.drinkService;
import socialdrink.Drink;

/**
 * Created by carlosmorais on 09/06/16.
 */

@Controller
public class indexController {

    @Autowired
    private service.drinkService drinkService;

    @RequestMapping("/")
    ModelAndView index(ModelAndView model){
        Drink[] drinks = drinkService.getBestDrinks();
        for (Drink drink : drinks) {
            System.out.println(drink.getName());
        }
        model.setViewName("index");
        model.addObject("bestDrinks", drinks);
        return model;
    }

}
