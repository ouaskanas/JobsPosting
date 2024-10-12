package com.example.crud.dao.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long jobId;
    private String jobName;
    private String Job_Type;
    private String Job_Description;
    private int nbr_candidate=3;
    private String link;
    private String img_link;
    @ManyToOne
    private Recruter recruter;
    private String companyName;

    public void setRecruter() {
        if (this.recruter != null) {
            this.companyName = this.recruter.getCompany();
        } else {
            this.companyName = null;
        }
    }
}
