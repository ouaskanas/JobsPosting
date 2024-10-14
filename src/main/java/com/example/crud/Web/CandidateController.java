package com.example.crud.Web;

import com.example.crud.Service.Services.CandidateService;
import com.example.crud.Service.managers.CandidateManager;
import com.example.crud.dao.Entities.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateManager candidateManager;

    @GetMapping("/api/admin/candidates")
    public List<Candidate> GetAllCandidates(){
        return candidateManager.getAllCandidates();
    }

    @PostMapping("/api/admin/addcandidate")
    public Candidate AddCandidate(@RequestBody Candidate candidate){
        return candidateManager.addCandidate(candidate);
    }

    @PostMapping("/api/admin/altercandidate")
    public Candidate AlterCandidate(@RequestBody Candidate candidate){
        return candidateManager.updateCandidate(candidate);
    }

    @PostMapping("/api/admin/deletecandidate")
    public Candidate DeleteCandidate(@RequestBody Candidate candidate){
        return candidateManager.deleteCandidate(candidate);
    }
}
