package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import socialdrink.Consumer;
import socialdrink.User;

/**
 * Created by jpp on 10/06/16.
 */

@Controller
public class htmlController {
    //Só para testar o html quando estivermos a fazer as paginas

    @RequestMapping("/page")
    public String page(){
        return "registo/userWizard";
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ModelAndView test() {
        return new ModelAndView("userWizard", "command", new Consumer());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") User user,
                             ModelMap model) {
       // model.addAttribute("name", user.getName());

        return "result";
    }
}
