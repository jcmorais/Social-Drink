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
@SessionAttributes({"session","following"})
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
    String follow(@PathVariable("userId") String userId, @ModelAttribute("following") int[] following){

        String[] parts = userId.split("_");

        int user = Integer.parseInt(parts[0]);
        int session = Integer.parseInt(parts[1]);

        Consumer consumer = userService.followUser(session, user);

        ModelAndView model = new ModelAndView();

        int[] updated = new int[consumer.follow.size()];

        for(int i=0; i<updated.length; i++) {
            updated[i] = consumer.follow.toArray()[i].getID();
        }

        following = updated;

        return "sucesso";
    }

    @RequestMapping(value="/unfollow/{userId}", method = RequestMethod.POST)
    @ResponseBody
    String unfollow(@PathVariable("userId") String userId, @ModelAttribute("following") int[] following){

        String[] parts = userId.split("_");
        int user = Integer.parseInt(parts[0]);
        int session = Integer.parseInt(parts[1]);

        Consumer consumer = userService.unfollowUser(session, user);

        ModelAndView model = new ModelAndView();

        int[] updated = new int[consumer.follow.size()];

        for(int i=0; i<updated.length; i++) {
            updated[i] = consumer.follow.toArray()[i].getID();
        }

        following = updated;

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
