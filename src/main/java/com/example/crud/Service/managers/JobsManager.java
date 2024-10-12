package com.example.crud.Service.managers;


import com.example.crud.dao.Entities.Jobs;

import java.util.List;

public interface JobsManager {

    public Jobs addJob(Jobs job);
    public Jobs updateJob(Jobs job);
    public Jobs deleteJob(Jobs job);
    public Jobs getJobById(int id);
    public List<Jobs> getAllJobs();
}
