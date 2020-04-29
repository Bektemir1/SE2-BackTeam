package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "userSubjects")
public class UserSubjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @OneToOne
    @JoinColumn(name="subjectId", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Subjects subjects;

    @Column(name = "year", length = 255)
    private String year;

    @Column(name = "term")
    private Integer term;

    public UserSubjects(Integer id, Integer userId, Subjects subjects, String year, Integer term) {
        this.id = id;
        this.userId = userId;
        this.subjects = subjects;
        this.year = year;
        this.term = term;
    }

    public UserSubjects() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }
}
