package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "codeSub", length = 255)
    private String codeSub;

    @ManyToOne
    @JoinColumn(name="facultyId", referencedColumnName = "id")
    private Faculty faculty;

    @ManyToOne
    @JoinColumn(name="departmentId", referencedColumnName = "id")
    private Departments departments;

    @Column(name = "ects")
    private String ects;

    @Column(name = "lc")
    private String lc;

    public Subjects(Integer id, String title, String codeSub, Faculty faculty, Departments departments, String ects, String lc) {
        this.id = id;
        this.title = title;
        this.codeSub = codeSub;
        this.faculty = faculty;
        this.departments = departments;
        this.ects = ects;
        this.lc = lc;
    }

    public Subjects() {
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

    public String getCodeSub() {
        return codeSub;
    }

    public void setCodeSub(String codeSub) {
        this.codeSub = codeSub;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public String getEcts() {
        return ects;
    }

    public void setEcts(String ects) {
        this.ects = ects;
    }

    public String getLc() {
        return lc;
    }

    public void setLc(String lc) {
        this.lc = lc;
    }
}
