package com.shopping.service;

import com.shopping.models.InvoiceWrapper;

public interface InvoiceService {

  public InvoiceWrapper create(Integer shoppingCartId);

}
