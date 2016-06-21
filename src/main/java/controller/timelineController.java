package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Frederico on 21/06/2016.
 */
@Controller
public class timelineController {

    @RequestMapping("/timeline")
    public String getTimeline(){
        return "timeline";
    }



}
