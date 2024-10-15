package com.example.crud;

import com.example.crud.dao.Entities.Candidate;
import com.example.crud.dao.Repositories.CandidateRepository;
import com.example.crud.dao.Repositories.JobsRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

//    @Bean
//    ApplicationRunner start(CandidateRepository repository) {
//        return args -> {
//            repository.save(new Candidate(1, "Programmeur", "candi@mail.com", "066666666", "...", "...", "..."));
//        };
//    }
}