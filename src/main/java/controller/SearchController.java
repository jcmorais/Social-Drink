package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.SearchService;
import service.SearchServiceImpl;
import socialdrink.Bar;
import socialdrink.Consumer;
import socialdrink.Drink;

import java.util.List;

/**
 * Created by jpp on 04/07/16.
 */
@Controller
@SessionAttributes({"session", "sessionid"})
public class SearchController {
    @Autowired
    private SearchService loginService = new SearchServiceImpl();

    @RequestMapping(value = "/search/results", method = RequestMethod.GET)
    public ModelAndView getUser(ModelAndView model, @RequestParam("searchWord") String searchWord){

        List<Consumer> consumersRes = loginService.searchConsumer(searchWord);
        List<Bar> barsRes = loginService.searchBar(searchWord);
        List<Drink> drinksRes = loginService.searchDrink(searchWord);

        model.setViewName("search/results");
        model.addObject("consumersRes", consumersRes.toArray());
        model.addObject("barsRes", barsRes.toArray());
        model.addObject("drinksRes", drinksRes.toArray());

        return model;
    }
}
