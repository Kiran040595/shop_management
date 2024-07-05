package com.example.shopmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopmanagement.model.Alert;
import com.example.shopmanagement.service.AlertService;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {

    @Autowired
    private AlertService alertService;

    // Handles POST requests to /api/alerts
    @PostMapping
    public Alert addAlert(@RequestBody Alert alert) {
        return alertService.addAlert(alert); // Calls the addAlert method in the service layer
    }
}
