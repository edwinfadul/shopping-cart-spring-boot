package com.shopping.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shopping.models.Customers;
import com.shopping.service.CustomerService;

/**
 * 
 * @author Edwin Fadul
 */
@RestController
@RequestMapping(path = "/api/customer", produces = MediaType.APPLICATION_JSON_VALUE,
    method = {RequestMethod.GET, RequestMethod.POST})
public class CustomerRestController {

  @Autowired
  private CustomerService customerService;

  /**
   * Buscar un cliente por id.
   * 
   * @param id
   * @return Customers
   */
  @GetMapping("/{id}")
  public Customers find(@PathVariable("id") Integer id) {
    return customerService.findById(id);
  }

  /**
   * Crear un cliente con numero de documento, nombre y límite de crédito.
   * 
   * @param customer
   * @return Customers
   */
  @PostMapping
  public Customers create(@RequestBody Customers customer) {
    return customerService.save(customer);
  }

}
