package com.example.demo.Service;

import com.example.demo.Entities.Customer;



public interface CustomerService{

    Customer getCustomer(int id);

    Customer addCustomer(Customer c);
    Customer updateCustomer(Customer c);

    String deleteCustomer(int id);

}
