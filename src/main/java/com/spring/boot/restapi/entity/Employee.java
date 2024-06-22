package com.spring.boot.restapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="employee_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}
