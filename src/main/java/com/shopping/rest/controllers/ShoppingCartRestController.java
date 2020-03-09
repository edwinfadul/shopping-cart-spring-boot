package com.shopping.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shopping.models.ShoppingCartItems;
import com.shopping.models.ShoppingCartWrapper;
import com.shopping.service.ShoppingCartService;

/**
 * 
 * @author Edwin Fadul
 *
 */
@RestController
@RequestMapping(path = "/api/shopping/cart", produces = MediaType.APPLICATION_JSON_VALUE,
    method = {RequestMethod.GET, RequestMethod.POST})
public class ShoppingCartRestController {

  @Autowired
  private ShoppingCartService shoppingCartService;


  /**
   * Crea el carrito de compras con sus items
   * 
   * @param shoppingCartWrapper
   * @return
   */
  @PostMapping("/create")
  public ShoppingCartWrapper create(@RequestBody ShoppingCartWrapper shoppingCartWrapper) {
    return shoppingCartService.save(shoppingCartWrapper);
  }

  /**
   * Actualiza el item del carrito de compras
   * 
   * @param shoppingCartItems
   * @return ShoppingCartItems
   */
  @PutMapping("/update")
  public ShoppingCartItems update(@RequestBody ShoppingCartItems shoppingCartItems) {
    return shoppingCartService.update(shoppingCartItems);
  }

  /**
   * Elimina el item del carrito de compras
   * 
   * @param id
   * @return true or false
   */
  @DeleteMapping("/delete/{id}")
  public Boolean delete(@PathVariable("id") Integer id) {
    return shoppingCartService.delete(id);
  }


}
