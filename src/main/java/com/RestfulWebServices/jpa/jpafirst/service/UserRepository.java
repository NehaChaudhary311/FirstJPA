package com.RestfulWebServices.jpa.jpafirst.service;

import com.RestfulWebServices.jpa.jpafirst.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Provide the entity you wish to manage and primary key of User
public interface UserRepository extends JpaRepository<User, Long> {

}
