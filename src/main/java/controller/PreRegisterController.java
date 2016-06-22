package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jpp on 22/06/16.
 */
@Controller
public class PreRegisterController {
    //Só para testar o html quando estivermos a fazer as paginas

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model){
        model.setViewName("/registo/preWizard");
        return model;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView addUser(ModelAndView model,
                                @RequestParam("tipoConta") String tipo
    ) {

        if(tipo.equals("utilizador")) model.setViewName("/registo/userWizard");
        else if(tipo.equals("bar")) model.setViewName("/registo/barWizard");

        return model;
    }
}

