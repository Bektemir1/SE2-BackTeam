package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "grades")
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @ManyToOne
    @JoinColumn(name="subjectId", referencedColumnName = "id")
    private Subjects subjects;

    @Column(name = "midtermExam")
    private Integer midtermExam;

    @Column(name = "finalExam")
    private Integer finalExam;

    @Column(name = "total")
    private Integer total;

    @Column(name = "letter", length = 20)
    private String letter;

    @Column(name = "year", length = 20)
    private String year;

    @Column(name = "term")
    private Integer term;

    public Grades(Integer id, Integer userId, Subjects subjects, Integer midtermExam, Integer finalExam, Integer total, String letter, String year, Integer term) {
        this.id = id;
        this.userId = userId;
        this.subjects = subjects;
        this.midtermExam = midtermExam;
        this.finalExam = finalExam;
        this.total = total;
        this.letter = letter;
        this.year = year;
        this.term = term;
    }

    public Grades() {
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

    public Integer getMidtermExam() {
        return midtermExam;
    }

    public void setMidtermExam(Integer midtermExam) {
        this.midtermExam = midtermExam;
    }

    public Integer getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(Integer finalExam) {
        this.finalExam = finalExam;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
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
