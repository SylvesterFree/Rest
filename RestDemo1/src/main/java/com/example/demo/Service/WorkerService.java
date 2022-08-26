package com.example.demo.Service;

import com.example.demo.Entities.Worker;

public interface WorkerService {
    int showPay(int id);
    Worker getWorker(int id);
    Worker updateWorker(Worker w);
    Worker hireWorker(Worker w);
    String deleteWorker(int id);
}
