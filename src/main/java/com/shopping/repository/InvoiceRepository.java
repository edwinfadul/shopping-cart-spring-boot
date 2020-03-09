package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.models.InvoiceHeader;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceHeader, Integer> {
}
