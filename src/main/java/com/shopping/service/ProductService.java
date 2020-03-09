package com.shopping.service;

import com.shopping.models.Products;

public interface ProductService {

  public Products findById(Integer id);

  public boolean update(Products product);
}
