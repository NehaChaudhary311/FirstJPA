package com.RestfulWebServices.jpa.jpafirst.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// To store user into a TABLE - @Entity

@Entity

// Alternative for default, parameter constructor, getter setter, toString using lambok
@Data
public class User {
    @Id
    @GeneratedValue
    private long id;
    // create getter setter for one field only lambok
//    @Getter
//    @Setter
    private String name;
    private String role;

    // JPA expects a default constructor
//    public User() {
//    }

//    public User(String name, String role) {
//        this.name = name;
//        this.role = role;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", role='" + role + '\'' +
//                '}';
//    }
}
