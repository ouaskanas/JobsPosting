package com.example.crud.Service.managers;

import com.example.crud.dao.Entities.Candidate;

import java.util.List;

public interface CandidateManager {
    public Candidate addCandidate(Candidate candidate);
    public Candidate updateCandidate(Candidate candidate);
    public Candidate deleteCandidate(Candidate candidate);
    public Candidate getCandidate(Integer id);
    public List<Candidate> getAllCandidates();
}
