package com.example.demo.MyController;

import com.example.demo.Entities.Customer;
import com.example.demo.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @Autowired
    private CustomerService cS;

    @GetMapping("/customer/{customerID}")
    public Customer getCustomer(@PathVariable String CustomerID){
        return this.cS.getCustomer(Integer.parseInt(CustomerID));
    }
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer c){
        return this.cS.addCustomer(c);
    }
    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer c){
        return  this.cS.updateCustomer(c);
    }
    @DeleteMapping("/customer/{customerID}")
    public String deleteCustomer(@PathVariable String CustomerID){
        return this.cS.deleteCustomer(Integer.parseInt(CustomerID));
    }
}
