package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import service.drinkService;
import socialdrink.Drink;
import socialdrink.Step;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedList;
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
        model.addObject("evaluations", drink.evaluation.toArray());
        model.addObject("commentsLength", drink.evaluation.toArray().length);
        model.addObject("photos", drink.getAlbum().fotos.toArray());
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


        int drinkId = drinkService.addDrink(nome, descricao, tempo, tipoBebida, quantidade, passos, ingredientes, quantidades);
        model.addObject("successMessage","yes");
        model.addObject("message","Drink criado com sucesso!");
        model.setViewName("redirect:"+drinkId+"/photos");



        return model;
    }


    @RequestMapping(value="/{drinkId}/photos", method = RequestMethod.GET)
    ModelAndView uploadFileHandler(ModelAndView model,
                                   @PathVariable("drinkId") int drinkId){
        model.setViewName("drink/photos");
        model.addObject("drinkId", drinkId);
        return model;
    }


    @RequestMapping(value="/{drinkId}/photo", method = RequestMethod.POST)
    @ResponseBody
    String uploadFileHandler(@PathVariable("drinkId") int drinkId,
                             @RequestParam("photoFile") MultipartFile photoFile) {
        this.drinkService.setDrinkProfile(drinkId, photoFile);
        return "foto adicionada com sucesso";
    }


    @RequestMapping(value="/{drinkId}/photos", method = RequestMethod.POST)
    @ResponseBody
    String uploadFileHandler(@PathVariable("drinkId") int drinkId,
                                   @RequestParam("photosFiles") MultipartFile photosFiles[]) {
        this.drinkService.addPhotosToAlbum(drinkId, photosFiles);
        return "fotos adicionadas com sucesso ao album";
    }




    @RequestMapping(value = "/{drinkId}/evaluation", method =  RequestMethod.POST)
    @ResponseBody
    String comment(@PathVariable("drinkId") int drinkId,
                   @RequestParam("comment") String comment,
                   @RequestParam("stars") int stars){
        System.out.println("stars:"+stars+"\ncomment: "+comment);
        drinkService.addEvaluation(drinkId, comment, stars);
        return "ok";
    }











}
