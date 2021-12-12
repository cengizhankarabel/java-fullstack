package com.example.web;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateResource {

    @GetMapping(value = "/api/private-resource")
    private String getPrivateResource(){
        SecurityContext securityContext= SecurityContextHolder.getContext();
        Authentication authentication=securityContext.getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        System.out.println("current user : "+userDetails.getUsername());
        return "PRIVATE-RESOURCE";
    }
}
