package com.example.crud.Service.managers;

import com.example.crud.dao.Entities.Recruter;

import java.util.List;

public interface RecruterManager {
    public Recruter createRecruter(Recruter recruter);
    public Recruter updateRecruter(Recruter recruter);
    public Recruter deleteRecruter(Recruter recruter);
    public Recruter getRecruter(int id);
    public List<Recruter> getAllRecruters();
}
