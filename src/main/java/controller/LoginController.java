package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import service.LoginService;
import service.LoginServiceImpl;
import socialdrink.Consumer;
import socialdrink.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpp on 03/07/16.
 */
@Controller
@SessionAttributes({"session","following","sessionid"})
public class LoginController {
    @Autowired
    private LoginService loginService = new LoginServiceImpl();

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(ModelAndView model,
                                @RequestParam("email") String email,
                                @RequestParam("password") String password
    ) {

        User session = loginService.login(email, password);
        List<Integer> following = new ArrayList<>();

        for(User follow : ((Consumer) session).follow.toArray()) {
            following.add(follow.getID());
        }

        if(session == null) model.setViewName("redirect:/");

        else {
            model.addObject("session", session);
            model.addObject("following", following.toArray());
            model.addObject("sessionid", session.getID());
            model.setViewName("redirect:/user/" + session.getID());
        }

        return model;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout(ModelAndView model) {
        
        model.addObject("sessionid", "-1");
        model.setViewName("redirect:/");

        return model;
    }


}
