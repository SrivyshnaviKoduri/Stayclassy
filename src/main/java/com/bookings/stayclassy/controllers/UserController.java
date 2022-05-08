package com.bookings.stayclassy.controllers;

import com.bookings.stayclassy.entities.User;
import com.bookings.stayclassy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable(value = "id") Integer id){
        return userService.getUser(id);
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        user.setUserId(0);
        userService.saveUser(user);
    }
}
