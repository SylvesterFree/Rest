package com.example.demo.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int workerID;
    private int workerHours;
    private int workerPayRate;
    private String workerName;

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Worker() {

    }

    public Worker(int workerID, int workerHours, int workerPayRate, String workerName) {
        this.workerID = workerID;
        this.workerHours = workerHours;
        this.workerPayRate = workerPayRate;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public int getWorkerHours() {
        return workerHours;
    }

    public void setWorkerHours(int workerHours) {
        this.workerHours = workerHours;
    }

    public int getWorkerPayRate() {
        return workerPayRate;
    }

    public void setWorkerPayRate(int workerPayRate) {
        this.workerPayRate = workerPayRate;
    }
}
