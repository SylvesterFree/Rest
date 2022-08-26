package com.example.demo.Service;

import com.example.demo.Dao.CustomerDao;
import com.example.demo.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Consumer;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao cd;

    @Override
    public Customer getCustomer(int id) {
        Optional<Customer> c = this.cd.findById(id);
        Customer c1 = null;
        if(c.isPresent()){
            c1 = c.get();
        }else{
            throw new RuntimeException("Couldn't find customer");
        }
        return c1;
    }

    @Override
    public Customer addCustomer(Customer c) {
        return this.cd.save(c);
    }

    @Override
    public Customer updateCustomer(Customer c) {
        return this.cd.save(c);
    }

    @Override
    public String deleteCustomer(int id) {
        this.cd.deleteById(id);
        return "Deleted";
    }
}
