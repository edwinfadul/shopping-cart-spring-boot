package com.shopping.service;

import com.shopping.models.Customers;

public interface CustomerService {

  public Customers findById(Integer id);

  public Customers save(Customers customer);
}
