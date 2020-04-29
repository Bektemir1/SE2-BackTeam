package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "day", length = 50)
    private String day;

    @Column(name = "lessonStarts", length = 50)
    private String lessonStarts;

    @Column(name = "lessonEnds", length = 50)
    private String lessonEnds;

    @Column(name = "room")
    private Integer room;

    @Column(name = "year", length = 20)
    private String year;

    @Column(name = "term")
    private Integer term;

    @OneToOne
    @JoinColumn(name="advisorId", referencedColumnName = "id")
    private Advisors advisors;

    @OneToOne
    @JoinColumn(name="subjectId", referencedColumnName = "id")
    private Subjects subjects;

    @Column(name = "departmentId")
    private Integer departmentId;

    public Schedule(Integer id, String day, String lessonStarts, String lessonEnds, Integer room, String year, Integer term, Advisors advisors, Subjects subjects, Integer departmentId) {
        this.id = id;
        this.day = day;
        this.lessonStarts = lessonStarts;
        this.lessonEnds = lessonEnds;
        this.room = room;
        this.year = year;
        this.term = term;
        this.advisors = advisors;
        this.subjects = subjects;
        this.departmentId = departmentId;
    }

    public Schedule() {
    }

    public Integer getId() {
        return id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLessonStarts() {
        return lessonStarts;
    }

    public void setLessonStarts(String lessonStarts) {
        this.lessonStarts = lessonStarts;
    }

    public String getLessonEnds() {
        return lessonEnds;
    }

    public void setLessonEnds(String lessonEnds) {
        this.lessonEnds = lessonEnds;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
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

    public Advisors getAdvisors() {
        return advisors;
    }

    public void setAdvisors(Advisors advisors) {
        this.advisors = advisors;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
