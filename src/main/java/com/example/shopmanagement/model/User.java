package com.example.shopmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity // Indicates that this class is a JPA entity
public class User {
    @Id // Specifies the primary key of the entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures the way of incrementing the specified field
    private Long id;

    private String username; // Stores the username of the user
    private String password; // Stores the hashed password of the user
    private String email; // Stores the email address of the user

    @Temporal(TemporalType.TIMESTAMP) // Specifies that the field should be treated as a timestamp
    private Date createdAt = new Date(); // Stores the creation timestamp of the user entity

    // Getters and setters for accessing and modifying the fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    
    //checking     
    //2nd checking
    //3rd checking
    //tokenchecking 
    //again checking
    
}
