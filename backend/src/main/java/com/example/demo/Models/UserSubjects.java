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

    public UserSubjects(Integer id, Integer userId, Subjects subjects) {
        this.id = id;
        this.userId = userId;
        this.subjects = subjects;
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
}
