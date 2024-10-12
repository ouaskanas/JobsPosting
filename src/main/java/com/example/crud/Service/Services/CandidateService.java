package com.example.crud.Service.Services;

import com.example.crud.Service.managers.CandidateManager;
import com.example.crud.dao.Entities.Candidate;
import com.example.crud.dao.Repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService implements CandidateManager {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate addCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public Candidate updateCandidate(Candidate candidate) {
        return addCandidate(candidate);
    }

    @Override
    public Candidate deleteCandidate(Candidate candidate) {
        try {
            candidateRepository.delete(candidate);
            return candidate;
        }
        catch (Exception e) {
            System.out.println("Failed to delete candidate "+candidate.getCandidateId()+" error : "+e.getMessage());
            return null;
        }
    }

    @Override
    public Candidate getCandidate(Integer id) {
        return candidateRepository.findById(id).get();
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }
}


