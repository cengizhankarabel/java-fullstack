package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User dbuser=userRepository.findByEmail(username);
        if(dbuser!=null){
            UserDetails userDetails= new org.springframework.security.core.userdetails.User(dbuser.getEmail(), dbuser.getPassword(), new ArrayList<>());
        return userDetails;
        }else{
            throw new UsernameNotFoundException(username);
        }
    }
}
