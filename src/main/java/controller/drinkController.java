package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by carlosmorais on 08/06/16.
 */

@Controller
public class drinkController {


    @RequestMapping(value = "/drink/{drinkId}", method = RequestMethod.GET)
    public String getDrink(@PathVariable("drinkId") String drinkId){
        //vai muscar a drink e adiciona ao model
        return "drink";
    }



    @RequestMapping(value = "/drinkform", method = RequestMethod.GET)
    public String drinIndex(){
        return "formularioDrink";
    }


    @RequestMapping(value = "/newdrink", method = RequestMethod.POST)
    public ModelAndView addDrink(ModelAndView model,
                                 @RequestParam("nome") String nome,
                                 @RequestParam("tempo") int tempo,
                                 @RequestParam("quantidade") int quantidade,
                                 @RequestParam("tipoQuantidade") String tipoQuantidade
                                 ){

        model.setViewName("index");
        System.out.println("Nome " + nome);
        System.out.println("quantidade " + quantidade);
        System.out.println("tempo " + tempo);
        System.out.println("tipoQuantidade " + tipoQuantidade);
        /*
        @RequestParam("passos") List<String> passos
        for (String passo : passos) {
            System.out.println("passo "+passo);
        }
        */
        return model;
    }


}
