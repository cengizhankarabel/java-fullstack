package com.example.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicResource {

//    @RequestMapping(
//            method = RequestMethod.GET,
//            value = "/api/public-resource"
//    )
//    - or -

    @GetMapping(
            value="/api/public-resource"
    )
    public String getPublicResource(){
        return "PUBLIC-RESOURCE";
    }

}
