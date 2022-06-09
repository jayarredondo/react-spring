package com.crm.crm.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoLoader implements CommandLineRunner {
    private final ContactRepository repository;

    @Autowired
    public DemoLoader(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run (String... strings) throws Exception {
        this.repository.save(new Contact("Jay", "Arredondo", "jearredondo13@gmail.com"));
    }
}
