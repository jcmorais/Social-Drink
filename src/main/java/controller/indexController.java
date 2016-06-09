package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by carlosmorais on 09/06/16.
 */

@Controller
public class indexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
