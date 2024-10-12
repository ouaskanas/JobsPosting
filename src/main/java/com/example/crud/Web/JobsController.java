package com.example.crud.Web;

import com.example.crud.Service.managers.JobsManager;
import com.example.crud.dao.Entities.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobsController {

    @Autowired
    private JobsManager jobsManager;

    @GetMapping("/api/jobs")
    public List<Jobs> getAllJobs(){
        return jobsManager.getAllJobs();
    }

    @PostMapping("/api/addjob")
    public Jobs addJob(@RequestBody Jobs job){
        return jobsManager.addJob(job);
    }

    @PostMapping("/api/alterjob")
    public Jobs updateJob(@RequestBody Jobs job){
        return jobsManager.updateJob(job);
    }

    @PostMapping("/api/deletejob")
    public Jobs deleteJob(@RequestBody Jobs job){
        return jobsManager.deleteJob(job);
    }

    @GetMapping("/api/job:{id}")
    public Jobs getJobById(@PathVariable int id){
        return jobsManager.getJobById(id);
    }

}
