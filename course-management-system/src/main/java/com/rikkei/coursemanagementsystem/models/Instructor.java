package com.rikkei.coursemanagementsystem.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "instructors")
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", length = 255)
    private String email;

    @OneToMany(mappedBy = "instructor",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Course> courses = new ArrayList<>();
}