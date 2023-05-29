package com.example.myapplication;

public class User {

    private String userName;
    private String email;
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    User(String username, String email, String password){

        this.userName = username;
        this.email =email;
        this.password = password;

    }
}
