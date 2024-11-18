package com.calzadosport.calzado_sport_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calzadosport.calzado_sport_app.entities.User;
import com.calzadosport.calzado_sport_app.services.IUserService;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> findUser(@RequestBody User user) {
        Boolean dbUser = userService.findUser(user);
        return dbUser ? ResponseEntity.ok(dbUser) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(userService.saveUser(user));
    }

}
