package controller;


import org.orm.PersistentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import socialdrink.Measure;
import socialdrink.MeasureCriteria;
import socialdrink.dao.MeasureDAO;
import socialdrink.impl.MeasureDAOImpl;


/**
 * Created by carlosmorais on 24/05/16.
 */


/* correr só para ter a certeza que está ok */


@Controller
public class testeController {
    @RequestMapping("/teste")
    public String teste(ModelAndView model){
            MeasureDAO dao = new MeasureDAOImpl();
        Measure[] measures = new Measure[0];
        try {
            measures = dao.listMeasureByCriteria(new MeasureCriteria());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        for (Measure measure : measures) {
                System.out.println(measure.getName());
            }
            model.addObject("measures", measures);
        return "index";
    }
}
