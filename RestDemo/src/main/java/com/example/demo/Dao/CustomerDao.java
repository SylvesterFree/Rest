package com.example.demo.Dao;

import com.example.demo.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {
}
