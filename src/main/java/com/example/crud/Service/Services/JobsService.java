package com.example.crud.Service.Services;

import com.example.crud.Service.managers.JobsManager;
import com.example.crud.dao.Entities.Jobs;
import com.example.crud.dao.Repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobsService implements JobsManager {

    @Autowired
    private JobsRepository jobsRepository;

    @Override
    public Jobs addJob(Jobs job) {
        return jobsRepository.save(job);
    }

    @Override
    public Jobs updateJob(Jobs job) {
        return addJob(job);
    }

    @Override
    public Jobs deleteJob(Jobs job) {
        try{
            jobsRepository.delete(job);
            return job;
        }
        catch(Exception e){
            System.out.println("error deleting job " +job.getJobId()+" error : "+e.getMessage());
            return null;
        }
    }

    @Override
    public Jobs getJobById(int id) {
        return jobsRepository.findById(id).get();
    }

    @Override
    public List<Jobs> getAllJobs() {
        return jobsRepository.findAll();
    }
}
