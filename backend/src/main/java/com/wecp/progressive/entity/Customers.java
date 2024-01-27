package com.wecp.progressive.entity;


public class Customers implements Comparable<Customers>{

    private int customerId;
    private String name;
    private String email;
    private String userName;
    private String password;
    private String role;
    public Customers() {
    }
    public Customers(int customerId, String name, String email, String userName, String password, String role) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
 
    @Override
    public int compareTo(Customers o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.getName());
    }
    @Override
    public String toString() {
        return "Customers [customerId=" + customerId + ", name=" + name + ", email=" + email + ", userName=" + userName
                + ", password=" + password + ", role=" + role + "]";
    }
}