package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String firstname;
    private String lastname;
    private String password;
//    private Role role;
    private String email;
//    private Date last_login_date;
//    private Date registration_date;
    private String last_login_ip;
    private int balance;
    private int status;
//    private Date birh_date;

    public Users() {
    }

    public Users(Users user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    public Users(String username, String firstname, String lastname, String password, String email, String last_login_ip, int balance, int status) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.email = email;
        this.last_login_ip = last_login_ip;
        this.balance = balance;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
