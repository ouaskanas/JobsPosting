package com.example.crud.Web;

import com.example.crud.Service.managers.CandidateManager;
import com.example.crud.Service.managers.JobsManager;
import com.example.crud.dao.Entities.Candidate;
import com.example.crud.dao.Entities.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/candidate")
public class CandidateController {

    @Autowired
    private JobsManager jobsManager;

    @Autowired
    private CandidateManager candidateManager;

    @GetMapping("/jobs")
    @PreAuthorize("hasRole('CANDIDATE')")
    public List<Jobs> getJobs() {
        return jobsManager.getAllJobs();
    }

    @PostMapping("/alteraccount")
    @PreAuthorize("hasRole('CANDIDATE')")
    public Candidate altercandidate(@RequestBody Candidate candidate){
        return candidateManager.updateCandidate(candidate);
    }

    //need to add candidature
}
