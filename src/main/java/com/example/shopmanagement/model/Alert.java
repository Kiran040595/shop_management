package com.example.shopmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Specifies a many-to-one relationship between Alert and Item
    @JoinColumn(name = "item_id") // Specifies the foreign key column
    private Item item;

    private int alertThreshold; // Stores the threshold quantity for triggering an alert
    private String alertColor; // Stores the color of the alert (e.g., red for low stock)

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date(); // Stores the creation timestamp of the alert entity

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getAlertThreshold() {
        return alertThreshold;
    }

    public void setAlertThreshold(int alertThreshold) {
        this.alertThreshold = alertThreshold;
    }

    public String getAlertColor() {
        return alertColor;
    }

    public void setAlertColor(String alertColor) {
        this.alertColor = alertColor;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
