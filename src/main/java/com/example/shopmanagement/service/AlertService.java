package com.example.shopmanagement.service;

import com.example.shopmanagement.model.Alert;
import com.example.shopmanagement.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    // Adds a new alert
    public Alert addAlert(Alert alert) {
        return alertRepository.save(alert); // Saves the alert to the database
    }
}
