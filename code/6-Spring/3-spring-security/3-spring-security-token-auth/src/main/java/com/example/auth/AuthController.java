package com.example.auth;

import com.example.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtUtils jwtUtils;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, UserDetailsService userDetailsService, JwtUtils jwtUtils) {
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtUtils = jwtUtils;
    }


    @PostMapping(
            value = "/login"
    )
    public ResponseEntity<?> doLogin(@RequestBody AuthRequest authRequest){
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword())
            );
        }catch (UsernameNotFoundException | BadCredentialsException e){
            throw new RuntimeException("incorrect username or password");
        }
        UserDetails userDetails = userDetailsService.loadUserByUsername(authRequest.getEmail());
        String jwt=jwtUtils.generateToken(userDetails);

        AuthResponse authResponse = new AuthResponse(jwt);
        return ResponseEntity.ok(authResponse);
    }

}