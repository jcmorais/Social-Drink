package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;
import socialdrink.Consumer;
import socialdrink.Event;
import socialdrink.User;

/**
 * Created by carlosmorais on 03/07/16.
 */

@Controller
@RequestMapping(value = "/favorite")
@SessionAttributes({"session","sessionid"})
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

    @RequestMapping(value="/follow/{userId}/{sessionId}", method = RequestMethod.POST)
    @ResponseBody
    String follow(@PathVariable("userId") int userId,
                  @PathVariable("sessionId") int sessionId)
                  {

        userService.followUser(sessionId, userId);

        return "sucesso";
    }

    @RequestMapping(value="/unfollow/{userId}/{sessionId}", method = RequestMethod.POST)
    @ResponseBody
    String unfollow(@PathVariable("userId") int userId, @PathVariable("sessionId") int sessionId) {

        userService.unfollowUser(sessionId, userId);

        return "sucesso";
    }

    @RequestMapping(value="/add/{drinkId}/{userId}", method = RequestMethod.POST)
    @ResponseBody
    String addFavorite(@PathVariable("drinkId") int drinkId,
                       @PathVariable("userId") int userId){
        userService.addFavoriteDrink(drinkId, userId);
        return "sucesso";
    }


    @RequestMapping(value="/remove/{drinkId}/{userId}", method = RequestMethod.POST)
    @ResponseBody
    String removeFavorite(@PathVariable("drinkId") int drinkId,
                          @PathVariable("userId") int userId){
        userService.removeFavoriteDrink(drinkId, userId);
        return "sucesso";
    }
}
