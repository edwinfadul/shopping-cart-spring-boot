package com.shopping.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shopping.models.InvoiceWrapper;
import com.shopping.service.InvoiceService;

/**
 * 
 * @author Edwin Fadul
 *
 */
@RestController
@RequestMapping(path = "/api/invoice", produces = MediaType.APPLICATION_JSON_VALUE,
    method = {RequestMethod.GET, RequestMethod.POST})
public class InvoiceRestController {

  @Autowired
  private InvoiceService invoiceService;

  /**
   * Crea una facturación con el id del carrito de compras
   * 
   * @param shoppingCartId
   * @return InvoiceWrapper
   */
  @GetMapping("/{id}")
  public InvoiceWrapper create(@PathVariable("id") Integer shoppingCartId) {
    return invoiceService.create(shoppingCartId);
  }

}
