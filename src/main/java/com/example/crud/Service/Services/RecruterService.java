package com.example.crud.Service.Services;

import com.example.crud.Service.managers.RecruterManager;
import com.example.crud.dao.Entities.Recruter;
import com.example.crud.dao.Repositories.RecruterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecruterService implements RecruterManager {

    @Autowired
    private RecruterRepository recruterRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private void EncodePassword(Recruter recruter){
        String password = recruter.getRecruter_Password();
        String encodedPassword = passwordEncoder.encode(password);
        recruter.setRecruter_Password(encodedPassword);
    }
    @Override
    public Recruter createRecruter(Recruter recruter) {
        return recruterRepository.save(recruter);
    }

    @Override
    public Recruter updateRecruter(Recruter recruter) {
        return createRecruter(recruter);
    }

    @Override
    public Recruter deleteRecruter(Recruter recruter) {
        try{
            recruterRepository.delete(recruter);
            return recruter;
        }
        catch(Exception e){
            System.out.println("Error deleting Recruter "+recruter.getRecruter_ID()+" error : "+e.getMessage());
            return null;
        }
    }

    @Override
    public Recruter getRecruter(int id) {
        return recruterRepository.findById(id).get();
    }

    @Override
    public List<Recruter> getAllRecruters() {
        return recruterRepository.findAll();
    }
}
