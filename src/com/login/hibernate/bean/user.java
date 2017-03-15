package com.login.hibernate.bean;
 
public class user {
    private int id;
    private String userName;
    private String password1;
    private String email;
    private String phone;
    private String city;
 
    public int getId() {
        return id;
    }
 
    public void setId(final int id) {
        this.id = id;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(final String userName) {
        this.userName = userName;
    }
 
    public String getPassword1() {
        return password1;
    }
 
    public void setPassword1(final String password1) {
        this.password1 = password1;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(final String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(final String phone) {
        this.phone = phone;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(final String city) {
        this.city = city;
    }
 
}
