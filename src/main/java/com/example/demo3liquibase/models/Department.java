package com.example.demo3liquibase.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "department")
    private Set<User> user;
}

