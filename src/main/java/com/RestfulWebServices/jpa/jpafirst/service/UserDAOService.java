package com.RestfulWebServices.jpa.jpafirst.service;

import com.RestfulWebServices.jpa.jpafirst.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
// This helps us in saving data to DB - @Repository
// Transactional -  Means that each method will be part of different transaction
@Repository
@Transactional
public class UserDAOService {
    // Persistence Context - EntityManager only tracks those objects which are persisted to it
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        // Open Transaction - Make Changes -  close Transaction
        entityManager.persist(user);
        return user.getId();
    }
}
