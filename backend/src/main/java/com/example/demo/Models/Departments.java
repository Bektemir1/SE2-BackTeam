package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title", length = 255)
    private String title;

    @ManyToOne
    @JoinColumn(name="facultyId", referencedColumnName = "id")
    private Faculty faculty;

    public Departments(Integer id, String title, Faculty faculty) {
        this.id = id;
        this.title = title;
        this.faculty = faculty;
    }

    public Departments() {
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
