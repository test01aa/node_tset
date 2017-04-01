package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor // (3)
@AllArgsConstructor // (4)
@Entity // (1)
@Table(name = "customers") // (2)
public class Customer {
    @Id // (5)
    @GeneratedValue // (6)
    private Integer id;
    private String firstName;
    private String lastName;
}