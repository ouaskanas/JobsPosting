package com.example.crud.Web;

import com.example.crud.Service.Services.RecruterService;
import com.example.crud.Service.managers.RecruterManager;
import com.example.crud.dao.Entities.Recruter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecruterController {

    @Autowired
    private RecruterManager recruterManager;

    @GetMapping("/api/admin/recruters")
    public List<Recruter> getAllRecruters() {
        return recruterManager.getAllRecruters();
    }

    @PostMapping("/api/admin/alterrecruter")
    public Recruter ModifyRecruter(@RequestBody Recruter recruter) {
        return recruterManager.updateRecruter(recruter);
    }

    @PostMapping("/api/admin/addrecruter")
    public Recruter AddRecruter(@RequestBody Recruter recruter) {
        return recruterManager.createRecruter(recruter);
    }

    @PostMapping("/api/admin/deleterecruter")
    public Recruter DeleteRecruter(@RequestBody Recruter recruter) {
        return recruterManager.deleteRecruter(recruter);
    }
}
