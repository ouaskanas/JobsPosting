package com.example.crud.dao.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recruter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long recruter_ID;
    private String recruter_Name;
    private String Company;
    private String recruter_Email;
    private String recruter_Number;
    @OneToMany()
    private List<Jobs> jobsList;
}
