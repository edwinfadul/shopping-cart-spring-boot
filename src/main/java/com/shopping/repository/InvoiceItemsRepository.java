package com.shopping.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.models.InvoiceItems;

@Repository
public interface InvoiceItemsRepository extends JpaRepository<InvoiceItems, Integer> {

  public List<InvoiceItems> findAllByIdInvoice(Integer idInvoive);
}
