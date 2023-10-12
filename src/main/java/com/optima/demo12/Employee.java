package com.optima.demo12;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "date")
    private String date;


    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departement department;

    // An employee can have many tasks
    @OneToMany(mappedBy = "assignedTo")
    private List<Task> tasks;


}
