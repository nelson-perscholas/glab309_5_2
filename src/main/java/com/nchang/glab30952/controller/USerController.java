package com.nchang.glab30952.controller;

import com.nchang.glab30952.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class USerController {

    @PostMapping("/users")
    public void printData(@RequestBody User user) {
        System.out.println("Printing the user data:" + user);
    }
}
