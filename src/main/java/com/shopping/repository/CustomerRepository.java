package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.models.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
}
