package com.calzadosport.calzado_sport_app.services;

import com.calzadosport.calzado_sport_app.entities.User;

public interface IUserService {
    Boolean findUser(User user);
    User saveUser(User user);
}
