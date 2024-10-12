package com.example.crud.dao.Repositories;

import com.example.crud.dao.Entities.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, Integer> {
}
