package com.spring.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/basic")
public class BasicController {

@GetMapping("/mybasic")
    public String basic(){
    return "hello mahmoud shoman";
}


    @GetMapping("/allbasic")
    public String All(){
        return "hello mahmoud shoman , do you happy";
    }


}
