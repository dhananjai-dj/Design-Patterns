package com.designPatterns.creational.prototype;

public class User {
    private String name;
    private String email;
    private int usage;

    public User() {
    }

    //Copy Constructor
    public User(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.usage = user.getUsage();
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

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", usage=" + usage + '}';
    }
}
