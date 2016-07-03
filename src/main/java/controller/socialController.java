package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;
import socialdrink.Event;

/**
 * Created by carlosmorais on 03/07/16.
 */

@Controller
@RequestMapping(value = "/favorite")
public class socialController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/social", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView social(ModelAndView model){
        model.setViewName("timeline");
        Event[] events = userService.getUserEvents();
        for (Event event : events) {
            System.out.println("event "+event.toString());
        }
        model.addObject("events", userService.getUserEvents());
        return model;
    }

    @RequestMapping(value="/follow/{userId}", method = RequestMethod.POST)
    @ResponseBody
    String follow(@PathVariable("userId") int userId){
        userService.followUser(userId);
        return "sucesso";
    }

    @RequestMapping(value="/unfollow/{userId}", method = RequestMethod.POST)
    @ResponseBody
    String unfollow(@PathVariable("userId") int userId){
        userService.unfollowUser(userId);
        return "sucesso";
    }

    @RequestMapping(value="/add/{drinkId}", method = RequestMethod.POST)
    @ResponseBody
    String addFavorite(@PathVariable("drinkId") int drinkId){
        userService.addFavoriteDrink(drinkId);
        return "sucesso";
    }


    @RequestMapping(value="/remove/{drinkId}", method = RequestMethod.POST)
    @ResponseBody
    String removeFavorite(@PathVariable("drinkId") int drinkId){
        userService.removeFavoriteDrink(drinkId);
        return "sucesso";
    }
}
