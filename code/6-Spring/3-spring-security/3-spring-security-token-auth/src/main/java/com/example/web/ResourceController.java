package com.example.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/api/public")
    public String publicResource(){
        return "PUBLIC";
    }

    @GetMapping("/api/private")
    public String privateResource(){

        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails=(UserDetails) authentication.getPrincipal();

        System.out.println(userDetails.getUsername());
        System.out.println(userDetails.getAuthorities());

        return "PRIVATE";
    }
}
