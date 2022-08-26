package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;
    private String customerEmail;
    private String custerPassword;
    public Customer(int customerID, String customerEmail, String custerPassword){
        this.customerEmail=customerEmail;
        this.custerPassword=custerPassword;
    }

    public Customer() {

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCusterPassword() {
        return custerPassword;
    }

    public void setCusterPassword(String custerPassword) {
        this.custerPassword = custerPassword;
    }
}
