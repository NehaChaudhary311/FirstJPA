package com.RestfulWebServices.jpa.jpafirst;

import com.RestfulWebServices.jpa.jpafirst.entity.User;
import com.RestfulWebServices.jpa.jpafirst.service.UserDAOService;
import com.RestfulWebServices.jpa.jpafirst.service.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
// alternative for Logger log
@Slf4j
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    // private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Alison Wonderland");
        user.setRole("Admin");

        // will return a user
        userRepository.save(user);

        log.info("New User created: "+ user);

    }
}
