package com.inspur.demo.entity;

public class User {
    
    private String username;
    private String email;
    private String password;
    private String comment;
    
    public String getName() {
        return username;
    }
    
    public void setName(String name) {
        this.username = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
}
