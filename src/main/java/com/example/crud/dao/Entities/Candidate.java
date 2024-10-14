package com.example.crud.dao.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CandidateId;
    private String CandidateName;
    private String CandidateEmail;
    private String CandidatePhone;
    private String CV_url;
    private String Candidate_Password;
    private String Img_Url;
}
