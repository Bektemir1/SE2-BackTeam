package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private Integer attend;
    private Integer absent;
    private Integer permitted;

    public Attendance(String email, Integer attend, Integer absent, Integer permitted) {
        this.email = email;
        this.attend = attend;
        this.absent = absent;
        this.permitted = permitted;
    }

    public Attendance() {
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAttend() {
        return attend;
    }

    public void setAttend(Integer attend) {
        this.attend = attend;
    }

    public Integer getAbsent() {
        return absent;
    }

    public void setAbsent(Integer absent) {
        this.absent = absent;
    }

    public Integer getPermitted() {
        return permitted;
    }

    public void setPermitted(Integer permitted) {
        this.permitted = permitted;
    }
}
