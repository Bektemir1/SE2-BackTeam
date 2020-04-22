package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String code_sub;
    private Integer faculty_id;
    private Integer department_id;

    public Subjects(Integer subject_id, String title, String code_sub, Integer faculty_id, Integer department_id) {
        this.id = subject_id;
        this.title = title;
        this.code_sub = code_sub;
        this.faculty_id = faculty_id;
        this.department_id = department_id;
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

    public String getCode_sub() {
        return code_sub;
    }

    public void setCode_sub(String code_sub) {
        this.code_sub = code_sub;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }
}
