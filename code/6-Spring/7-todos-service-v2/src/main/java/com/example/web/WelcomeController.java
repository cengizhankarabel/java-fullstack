package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    // GET : / welcome
    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
    public @ResponseBody String doWelcome(){
        System.out.println("welcomeController::doWelcome()");
        return "welcome to spring web";
    }

}
