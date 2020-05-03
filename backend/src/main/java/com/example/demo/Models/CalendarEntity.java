package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "calendar")
public class CalendarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title", length = 255)
    private String title;

    @Column(name = "startDate", length = 255)
    private String startDate;

    @Column(name = "endDate", length = 255)
    private String endDate;

    @Column(name = "status")
    private Integer status;

    @Column(name = "year", length = 255)
    private String year;

    @Column(name = "term")
    private Integer term;

    public CalendarEntity(Integer id, String title, String startDate, String endDate, Integer status, String year, Integer term) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.year = year;
        this.term = term;
    }

    public CalendarEntity() {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
