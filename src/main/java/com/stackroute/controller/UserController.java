package com.stackroute.controller;
import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller //it is used to identify the controllers for spring mvc
public class UserController {

    @RequestMapping("/") //it is used to map web requests onto specific handler classes and handler methods
    public String returnMessage() {
        return "index";
    }

    @RequestMapping("/login")
    public ModelAndView display() {
        User user = new User();
        user.setUsername("afreen");
        ModelAndView modelAndView = new ModelAndView("greetings");
        modelAndView.addObject("name", user.getUsername() );
        return modelAndView;
    }
}