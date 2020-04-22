package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    @JoinColumn(name="subject_id", nullable=false)
    private Subjects subjects;
    private String email;
    private Integer absent;
    private Integer attend;
    private Integer permitted;
    private String year;
    private Integer term;

    public Attendance(Integer id, Subjects subjects, String email, Integer absent, Integer attend, Integer permitted, String year, Integer term) {
        this.id = id;
        this.subjects = subjects;
        this.email = email;
        this.absent = absent;
        this.attend = attend;
        this.permitted = permitted;
        this.year = year;
        this.term = term;
    }

    public Attendance() {
    }

    public Integer getId() {
        return id;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAbsent() {
        return absent;
    }

    public void setAbsent(Integer absent) {
        this.absent = absent;
    }

    public Integer getAttend() {
        return attend;
    }

    public void setAttend(Integer attend) {
        this.attend = attend;
    }

    public Integer getPermitted() {
        return permitted;
    }

    public void setPermitted(Integer permitted) {
        this.permitted = permitted;
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
