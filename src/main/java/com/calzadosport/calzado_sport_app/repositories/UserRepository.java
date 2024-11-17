package com.calzadosport.calzado_sport_app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.calzadosport.calzado_sport_app.entities.User;

public interface  UserRepository extends CrudRepository<User, Long>{

}
