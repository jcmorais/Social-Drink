package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;
import service.UserServiceImpl;
import socialdrink.*;

import java.util.List;

/**
 * Created by jpp on 29/06/16.
 */
@Controller
@RequestMapping(value = "/user")
@SessionAttributes({"session","sessionid"})
public class UserPageController {
    @Autowired
    private UserService userService = new UserServiceImpl();

    @RequestMapping(value = "/{userId}/{sessionid}", method = RequestMethod.GET)
    public ModelAndView getUser(ModelAndView model, @PathVariable("userId") int userId, @PathVariable("sessionid") int sessionid){
        User user = userService.getUserById(userId);

        if (user.drinks.size() > 4) {
            Drink[] drinks = new Drink[4];
            Drink[] aux = user.drinks.toArray();

            for (int i = 0; i < 4; i++) {
                drinks[i] = aux[i];
            }

            model.addObject("userdrinks",drinks);
        } else {
            model.addObject("userdrinks",user.drinks.toArray());
        }



        if(user instanceof Consumer) {
            model.setViewName("perfis/userProfile");
            Consumer consumer = (Consumer) user;
            model.addObject("user", consumer);

            if (consumer.favoriteDrinks.size() > 4) {
                Drink[] favorites = new Drink[4];
                Drink[] aux = consumer.favoriteDrinks.toArray();

                for (int i = 0; i < 4; i++) {
                    favorites[i] = aux[i];
                }

                model.addObject("favorites",favorites);
            } else {
                model.addObject("favorites",consumer.favoriteDrinks.toArray());
            }

            if (consumer.follow.size() > 4) {
                User[] follow = new User[4];
                User[] auxU = consumer.follow.toArray();

                for (int i = 0; i < 4; i++) {
                    follow[i] = auxU[i];
                }

                model.addObject("followers",follow);
            } else {
                model.addObject("followers",consumer.follow.toArray());
            }

            User aux = userService.getUserById(sessionid);
            User[] foll = ((Consumer) aux).follow.toArray();
            int bool = 0;

            for(int i=0; i< foll.length; i++) {
                if(foll[i].getID() == userId) {
                    bool = 1;
                    break;
                }
            }

            model.addObject("follow", bool);

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
