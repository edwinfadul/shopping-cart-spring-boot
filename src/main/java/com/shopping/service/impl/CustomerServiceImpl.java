package com.shopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.models.Customers;
import com.shopping.repository.CustomerRepository;
import com.shopping.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
  @Autowired
  private CustomerRepository userRepository;

  @Override
  public Customers findById(Integer id) {
    try {
      return userRepository.findById(id).get();
    } catch (Exception e) {
    }
    return null;
  }

  @Override
  public Customers save(Customers customer) {

    try {
      userRepository.save(customer);
    } catch (Exception e) {
    }

    return null;
  }


}
