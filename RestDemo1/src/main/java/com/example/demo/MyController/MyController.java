package com.example.demo.MyController;

import com.example.demo.Entities.Worker;
import com.example.demo.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class MyController {
    @Autowired
    private WorkerService ws;

    @GetMapping("/worker/{workerID}")
    public Worker getWorker(@PathVariable String workerID){
        return this.ws.getWorker(Integer.parseInt(workerID));
    }
    @GetMapping("/worker/{workerID}/pay")
    public int getWorkerPay(@PathVariable String workerID){
        return this.ws.showPay(Integer.parseInt(workerID));
    }
    @PostMapping("/worker")
    public Worker addCustomer(@RequestBody Worker w){
        return this.ws.hireWorker(w);
    }
    @PutMapping("/worker")
    public Worker updateCustomer(@RequestBody Worker w){
        return  this.ws.updateWorker(w);
    }
    @DeleteMapping("/worker/{customerID}")
    public String deleteWorker(@PathVariable String CustomerID){
        return this.ws.deleteWorker(Integer.parseInt(CustomerID));
    }
}
