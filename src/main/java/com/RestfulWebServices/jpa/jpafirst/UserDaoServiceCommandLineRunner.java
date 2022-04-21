package com.RestfulWebServices.jpa.jpafirst;

import com.RestfulWebServices.jpa.jpafirst.entity.User;
import com.RestfulWebServices.jpa.jpafirst.service.UserDAOService;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.activation.CommandObject;
import javax.transaction.Transactional;

@Component
@Order(1)
// alternative for Logger log
@Slf4j
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    // private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Neha");
        user.setRole("Ad");
        long insert = userDAOService.insert(user);
        log.info("New User created: "+ user);

    }
}
