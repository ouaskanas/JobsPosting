package com.example.crud.dao.Repositories;

import com.example.crud.dao.Entities.Recruter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruterRepository extends JpaRepository<Recruter,Integer> {

}
