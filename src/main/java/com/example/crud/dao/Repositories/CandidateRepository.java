package com.example.crud.dao.Repositories;

import com.example.crud.dao.Entities.Candidate;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
}
