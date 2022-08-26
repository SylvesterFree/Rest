package com.example.demo.Dao;

import com.example.demo.Entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Dao extends JpaRepository<Worker,Integer> {
}
