package com.spring.springsecurity.Controller;

import org.hibernate.annotations.Cache;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/")
public class loginController {

    @GetMapping("login")
    public String login(){
        return "login";
    }
}
