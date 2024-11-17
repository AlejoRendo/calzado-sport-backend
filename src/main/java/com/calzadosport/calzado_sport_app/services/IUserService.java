package com.calzadosport.calzado_sport_app.services;

import java.util.Optional;

import com.calzadosport.calzado_sport_app.entities.User;

public interface IUserService {
    Optional<User> findUser(User user);
    User saveUser(User user);
}
