package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.drinkService;
import socialdrink.Drink;
import socialdrink.Step;

import java.util.List;

/**
 * Created by carlosmorais on 08/06/16.
 */

@Controller
@RequestMapping(value = "/drink")
public class drinkController {

    @Autowired
    private drinkService drinkService;

    @RequestMapping(value = "/{drinkId}", method = RequestMethod.GET)
    public ModelAndView getDrink(ModelAndView model, @PathVariable("drinkId") int drinkId){
        model.setViewName("/drink/drink");
        Drink drink = drinkService.getDrinkById(drinkId);
        model.addObject("drink", drink);
        model.addObject("ingredients", drink.ingredients.toArray());
        Step[] steps = new Step[drink.steps.size()+1];
        for (Step step : drink.steps.toArray()) {
            steps[step.getNumber()-1] = step;
        }
        model.addObject("steps", steps);
        model.addObject("ingredientsLength", drink.ingredients.toArray().length);
        //mudar isto...
        model.addObject("commentsLength", drink.evaluation.toArray().length);
        return model;
    }

    @RequestMapping(value = "/newdrink", method = RequestMethod.GET)
    public ModelAndView newDrink(ModelAndView model){
        model.addObject("ingredientes", drinkService.getListIngredient());
        model.setViewName("drink/newDrink");
        return model;
    }


    @RequestMapping(value = "/newdrink", method = RequestMethod.POST)
    public ModelAndView addDrink(ModelAndView model,
                                 @RequestParam("nome") String nome,
                                 @RequestParam("descricao") String descricao,
                                 @RequestParam("tempo") int tempo,
                                 @RequestParam("quantidade") int quantidade,
                                 @RequestParam("tipoBebida") int tipoBebida,
                                 @RequestParam("passos[]") List<String> passos,
                                 @RequestParam("ingredientes[]") List<Integer> ingredientes,
                                 @RequestParam("quantidades[]") List<String> quantidades
                                 ){

        model.setViewName("index");

        /*
        System.out.println("Nome " + nome);
        System.out.println("Descrição " + descricao);
        System.out.println("quantidade " + quantidade);
        System.out.println("tempo " + tempo);
        System.out.println("tipoBebida " + tipoBebida);

        for (String passo : passos) {
            System.out.println("passo "+passo);
        }

        for (int s : ingredientes) {
            System.out.println("ingrediente "+s);
        }

        for (String s : quantidades) {
            System.out.println("quantidade "+s);
        }
*/
        this.drinkService.addDrink(nome, descricao, tempo, tipoBebida, quantidade, passos, ingredientes, quantidades);
        return model;
    }


}
