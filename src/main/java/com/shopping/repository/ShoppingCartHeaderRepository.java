package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.models.ShoppingCartHeader;

@Repository
public interface ShoppingCartHeaderRepository extends JpaRepository<ShoppingCartHeader, Integer> {
}