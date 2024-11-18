package com.calzadosport.calzado_sport_app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.calzadosport.calzado_sport_app.entities.User;
import com.calzadosport.calzado_sport_app.repositories.UserRepository;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;
    @Override
    @Transactional(readOnly=true)
    public Boolean findUser(User user) {
        return repository.equals(user);
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }
    
}
