package com.example.demo.Configs;

public class UserCredentialsPojo {
    private String oldPassword;
    private String newPassword;
    private String newPassword1;

    public UserCredentialsPojo(String oldPassword, String newPassword, String newPassword1) {
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
        this.newPassword1 = newPassword1;
    }

    public UserCredentialsPojo() {
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword1() {
        return newPassword1;
    }

    public void setNewPassword1(String newPassword1) {
        this.newPassword1 = newPassword1;
    }
}
