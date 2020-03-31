package com.example.demo.model;

import com.example.demo.model.Users;

public class CustomUser extends Users {
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

    public CustomUser(String username, String firstname, String lastname, String password, String email, String last_login_ip, int balance, int status) {
        super(username, firstname, lastname, password, email, last_login_ip, balance, status);
        this.username = username;
        this.firstname = firstname;
        this.email = email;
        this.balance = balance;
        this.last_login_ip = last_login_ip;
        this.status = status;
    }
}
