package com.app.customer.controller;

import com.app.customer.entity.User;
import com.app.customer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping
    public List<User> findUsers(@RequestBody User user){
        return this.userService.searchUser(user);
    }

    @GetMapping
    public List<User> findAllUsers(){
        return this.userService.findAll();
    }
}
