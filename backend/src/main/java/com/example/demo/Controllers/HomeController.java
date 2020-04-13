package com.example.demo.Controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    // Getting all user data
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public UserDetails getUsersData (@AuthenticationPrincipal UserDetails userDetails) {
        return userDetails;
    }
}
