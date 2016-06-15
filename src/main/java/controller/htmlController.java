package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jpp on 10/06/16.
 */

@Controller
public class htmlController {
    //Só para testar o html quando estivermos a fazer as paginas

    @RequestMapping("/page")
    public String page(){
        return "newBar";
    }
}
