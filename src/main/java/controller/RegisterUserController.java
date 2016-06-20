package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import socialdrink.Consumer;
import socialdrink.User;

import java.util.Map;

/**
 * Created by jpp on 16/06/16.
 */

@Controller
@RequestMapping(value = "/register")
public class RegisterUserController {
    @RequestMapping(method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        User userForm = new Consumer();
        model.put("userForm", userForm);


        return "Registration";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
                                      Map<String, Object> model) {

        // implement your own registration logic here...

        // for testing purpose:
        //System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        System.out.println("email: " + user.getEmail());
        //System.out.println("birth date: " + user.getBirthDate());
        //System.out.println("profession: " + user.getProfession());

        return "RegistrationSuccess";
    }
}
