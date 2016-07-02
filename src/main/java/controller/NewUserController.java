package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.RegisterService;
import service.RegisterServiceImpl;

import java.util.Date;

/**
 * Created by jpp on 22/06/16.
 */

@Controller
public class NewUserController {
    @Autowired
    private RegisterService registerService = new RegisterServiceImpl();

    @RequestMapping(value = "/register/newUser", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model){
        model.setViewName("/registo/preWizard");
        return model;
    }

    @RequestMapping(value = "/register/newUser", method = RequestMethod.POST)
    public ModelAndView addUser(ModelAndView model,
                                @RequestParam("email") String email,
                                @RequestParam("password") String password,
                                @RequestParam("photoFile") MultipartFile photoFile,
                                @RequestParam("primeironome") String primeiroNome,
                                @RequestParam("ultimonome") String ultimoNome,
                                @RequestParam("profissao") String profissao,
                                @RequestParam("cidade") String cidade,
                                @RequestParam("genero") String genero,
                                @RequestParam("date") Date dataNasc,
                                @RequestParam("contacto") String contacto,
                                @RequestParam("descricao") String descriçao
    ) {

        registerService.addConsumer(email, password, photoFile, primeiroNome, ultimoNome, profissao, cidade, genero, dataNasc, contacto, descriçao);

        model.setViewName("redirect:/");


        return model;
    }
}
