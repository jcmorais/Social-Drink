package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.RegisterService;
import service.RegisterServiceImpl;

import java.util.Date;

/**
 * Created by jpp on 27/06/16.
 */
@Controller
public class NewBarController {
    @Autowired
    private RegisterService registerService = new RegisterServiceImpl();

    @RequestMapping(value = "/register/newBar", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model){
        model.setViewName("/registo/preWizard");
        return model;
    }

    @RequestMapping(value = "/register/newBar", method = RequestMethod.POST)
    public ModelAndView addUser(ModelAndView model,
                                @RequestParam("email") String email,
                                @RequestParam("password") String password,
                                @RequestParam("nome") String nome,
                                @RequestParam("morada") String morada,
                                @RequestParam("cidade") String cidade,
                                @RequestParam("contacto") String contacto,
                                @RequestParam("descricao") String descriçao,
                                @RequestParam("check1") String check1,
                                @RequestParam("open1") String open1,
                                @RequestParam("close1") String close1,
                                @RequestParam("check2") String check2,
                                @RequestParam("open2") String open2,
                                @RequestParam("close2") String close2,
                                @RequestParam("check3") String check3,
                                @RequestParam("open3") String open3,
                                @RequestParam("close3") String close3,
                                @RequestParam("check4") String check4,
                                @RequestParam("open4") String open4,
                                @RequestParam("close4") String close4,
                                @RequestParam("check5") String check5,
                                @RequestParam("open5") String open5,
                                @RequestParam("close5") String close5,
                                @RequestParam("check6") String check6,
                                @RequestParam("open6") String open6,
                                @RequestParam("close6") String close6,
                                @RequestParam("check7") String check7,
                                @RequestParam("open7") String open7,
                                @RequestParam("close7") String close7
    ) {


        registerService.addBar(email, password, nome, morada, cidade, contacto, descriçao, check1, open1, close1, check2,
                open2, close2, check3, open3, close3, check4, open4, close4, check5, open5, close5, check6, open6,
                close6, check7, open7, close7);

        model.setViewName("redirect:/");


        return model;
    }
}
