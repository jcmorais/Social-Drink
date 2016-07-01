package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;
import service.UserServiceImpl;
import socialdrink.Bar;
import socialdrink.Consumer;
import socialdrink.User;
import socialdrink.Weekday;

import java.util.List;

/**
 * Created by jpp on 29/06/16.
 */
@Controller
@RequestMapping(value = "/user")
public class UserPageController {
    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public ModelAndView getDrink(ModelAndView model, @PathVariable("userId") int userId){
        User user = userService.getUserById(userId);

        if(user instanceof Consumer) {
            model.setViewName("perfis/userProfile");
            Consumer consumer = (Consumer) user;
            model.addObject("user", consumer);
        }
        
        if(user instanceof Bar) {
            Bar bar = (Bar) user;
            model.setViewName("perfis/barProfile");
            model.addObject("user",bar);
            model.addObject("horary", bar.horary.toArray());
        }

        return model;
    }

}