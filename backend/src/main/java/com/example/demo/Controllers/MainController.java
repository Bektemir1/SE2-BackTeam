package com.example.demo.Controllers;

import com.example.demo.Configs.UserCredentialsPojo;
import com.example.demo.Models.Users;
import com.example.demo.Service.JwtUtil;
import com.example.demo.Models.AuthenticationRequest;
import com.example.demo.Models.AuthenticationResponse;
import com.example.demo.Service.MyUserDetails;
import com.example.demo.Service.MyUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    // Change the password
    @RequestMapping(value = "/settings", method = RequestMethod.PUT)
    public String updatePassword(@AuthenticationPrincipal MyUserDetails myUserDetails,
                                       @RequestBody UserCredentialsPojo pojo) {
        return myUserDetailsService.changePassword(myUserDetails, pojo.getNewPassword(),
                                                    pojo.getNewPassword1(), pojo.getOldPassword());
    }

    // Authentication with jwt token
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username and password", e);
        }

        final UserDetails userDetails = myUserDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
