package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "teacherSubjects")
public class TeacherSubjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "teacherId")
    private Integer teacherId;

    @OneToOne
    @JoinColumn(name="subjectId", referencedColumnName = "id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Subjects subjects;

    @Column(name = "year", length = 255)
    private String year;

    @Column(name = "term")
    private Integer term;

    @Column(name = "course")
    private String course;

    public TeacherSubjects(Integer id, Integer teacherId, Subjects subjects, String year, Integer term, String course) {
        this.id = id;
        this.teacherId = teacherId;
        this.subjects = subjects;
        this.year = year;
        this.term = term;
        this.course = course;
    }

    public TeacherSubjects() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
