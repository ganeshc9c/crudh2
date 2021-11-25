package com.javatech.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatech.springboot.entity.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
