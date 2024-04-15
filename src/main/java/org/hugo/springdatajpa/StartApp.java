package org.hugo.springdatajpa;

import org.hugo.springdatajpa.model.User;
import org.hugo.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("huguito");
        user.setUsername("huguito");
        user.setPassword("huguito123");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }

    }
}
