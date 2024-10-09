package com.notary.client_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String clientFirstName;
    private String clientLastName;
    private String clientEmail;
    private String clientPhoneNum;
    private String clientService;

    public Client() {
    }

    // Getters and Setters
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhoneNum() {
        return clientPhoneNum;
    }

    public void setClientPhoneNum(String clientPhoneNum) {
        this.clientPhoneNum = clientPhoneNum;
    }

    public String getClientService(){
        return clientService;
    }

    public void setClientService(String clientService){
        this.clientService = clientService;
    }
}
