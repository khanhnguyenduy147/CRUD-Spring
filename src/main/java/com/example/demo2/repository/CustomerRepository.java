package com.example.demo2.repository;

import com.example.demo2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFullNameContainingOrMobileNumberContainingOrIdentifyNumberContaining(String fullName, String mobileNumber, String identifyNumber);
}

