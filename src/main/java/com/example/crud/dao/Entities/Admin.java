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
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdAdmin;
    private String Name;
    private String imgUrl;
    @OneToMany()
    private List<Jobs> jobsList;
}
