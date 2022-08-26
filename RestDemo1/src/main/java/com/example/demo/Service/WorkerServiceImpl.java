package com.example.demo.Service;

import com.example.demo.Dao.Dao;
import com.example.demo.Entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class WorkerServiceImpl implements WorkerService{
    @Autowired
    private Dao d;
    @Override
    public int showPay(int id) {
        return this.d.getById(id).getWorkerPayRate()*this.d.getReferenceById(id).getWorkerHours();
    }

    @Override
    public Worker getWorker(int id) {
        Optional<Worker> w = this.d.findById(id);
        Worker w1 = null;
        if(w.isPresent()){
            w1 = w.get();
        }else{
            throw new RuntimeException("Couldn't find worker");
        }
        return w1;
    }

    @Override
    public Worker updateWorker(Worker w) {
        return this.d.save(w);
    }

    @Override
    public Worker hireWorker(Worker w) {
        return this.d.save(w);
    }

    @Override
    public String deleteWorker(int id) {
        this.d.deleteById(id);
        return "Deleted";
    }
}
