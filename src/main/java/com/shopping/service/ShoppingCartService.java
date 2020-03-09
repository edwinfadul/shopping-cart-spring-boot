package com.shopping.service;

import com.shopping.models.ShoppingCartItems;
import com.shopping.models.ShoppingCartWrapper;

public interface ShoppingCartService {

  public ShoppingCartWrapper save(ShoppingCartWrapper shoppingCartWrapper);

  public ShoppingCartItems update(ShoppingCartItems shoppingCartItem);

  public Boolean delete(Integer id);

}
