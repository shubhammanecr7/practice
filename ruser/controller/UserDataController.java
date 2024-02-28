package com.ruser.controller;

import com.ruser.model.UserData;
import com.ruser.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/getNewUser")
    public UserData getNewUser(){
        String url = "https://randomuser.me/api/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, UserData.class);
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody UserData newUser) {
        return userDataService.saveUser(newUser);
    }

}
