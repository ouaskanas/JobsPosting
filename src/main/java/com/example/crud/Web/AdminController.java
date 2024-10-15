package com.example.crud.Web;

import com.example.crud.Service.managers.CandidateManager;
import com.example.crud.Service.managers.JobsManager;
import com.example.crud.Service.managers.RecruterManager; // Assurez-vous d'importer le bon manager pour les recruteurs
import com.example.crud.dao.Entities.Candidate;
import com.example.crud.dao.Entities.Jobs;
import com.example.crud.dao.Entities.Recruter; // Assurez-vous d'importer votre entité Recruter
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private CandidateManager candidateManager;

    @Autowired
    private RecruterManager recruterManager;

    @Autowired
    private JobsManager jobsManager;

    @GetMapping("/candidates")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Candidate> getAllCandidates() {
        return candidateManager.getAllCandidates();
    }

    @PostMapping("/addcandidate")
    @PreAuthorize("hasRole('ADMIN')")
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return candidateManager.addCandidate(candidate);
    }

    @PostMapping("/altercandidate")
    @PreAuthorize("hasRole('ADMIN')")
    public Candidate alterCandidate(@RequestBody Candidate candidate) {
        return candidateManager.updateCandidate(candidate);
    }

    @PostMapping("/deletecandidate")
    @PreAuthorize("hasRole('ADMIN')")
    public Candidate deleteCandidate(@RequestBody Candidate candidate) {
        return candidateManager.deleteCandidate(candidate);
    }

    @GetMapping("/recruiters")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Recruter> getAllRecruiters() {
        return recruterManager.getAllRecruters();
    }

    @PostMapping("/addrecruiter")
    @PreAuthorize("hasRole('ADMIN')")
    public Recruter addRecruiter(@RequestBody Recruter recruter) {
        return recruterManager.createRecruter(recruter);
    }

    @PostMapping("/alterrecruiter")
    @PreAuthorize("hasRole('ADMIN')")
    public Recruter alterRecruiter(@RequestBody Recruter recruter) {
        return recruterManager.updateRecruter(recruter);
    }

    @PostMapping("/deleterecruiter")
    @PreAuthorize("hasRole('ADMIN')")
    public Recruter deleteRecruiter(@RequestBody Recruter recruter) {
        return recruterManager.deleteRecruter(recruter);
    }

    @GetMapping("/jobs")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Jobs> getAllJobs() {
        return jobsManager.getAllJobs();
    }

    @PostMapping("/alterjob")
    @PreAuthorize("hasRole('ADMIN')")
    public Jobs addJobs(@RequestBody Jobs jobs) {
        return jobsManager.updateJob(jobs);
    }

    @PostMapping("/createjob")
    @PreAuthorize("hasRole('ADMIN')")
    public Jobs createJob(@RequestBody Jobs jobs) {
        return jobsManager.addJob(jobs);
    }

    @PostMapping("/deletejob")
    @PreAuthorize("hasRole('ADMIN')")
    public Jobs deleteJob(@RequestBody Jobs jobs) {
        return jobsManager.deleteJob(jobs);
    }

}
