package com.practice;

public class User {
    //  Properties
    private Integer id;
    private String name;
    private String email;

    // Creating User

    public User(Integer id, String name, String email) {

        // Defining Properties by variables (id, name, email)
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getter and Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    // toString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
