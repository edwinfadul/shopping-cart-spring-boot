package com.shopping.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.shopping.models.InvoiceHeader;
import com.shopping.models.InvoiceItems;
import com.shopping.models.InvoiceWrapper;
import com.shopping.models.ShoppingCartHeader;
import com.shopping.models.ShoppingCartItems;
import com.shopping.repository.InvoiceItemsRepository;
import com.shopping.repository.InvoiceRepository;
import com.shopping.repository.ShoppingCartHeaderRepository;
import com.shopping.repository.ShoppingCartRepository;
import com.shopping.service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService {

  @Autowired
  private ShoppingCartHeaderRepository shoppingCartHeaderRepository;

  @Autowired
  private ShoppingCartRepository shoppingCartRepository;

  @Autowired
  private InvoiceRepository invoiceRepository;

  @Autowired
  private InvoiceItemsRepository invoiceItemsRepository;

  @Override
  public InvoiceWrapper create(Integer shoppingCartId) {
    try {

      ShoppingCartHeader shoppingCartHeader =
          shoppingCartHeaderRepository.findById(shoppingCartId).get();

      List<ShoppingCartItems> shoppingCartItems =
          shoppingCartRepository.findAllByIdOrder(shoppingCartHeader.getId());

      InvoiceHeader invoiceHeader = new InvoiceHeader();
      invoiceHeader.setIdCustomer(shoppingCartHeader.getIdCustomer());
      invoiceHeader.setInvoiceAmount(shoppingCartHeader.getOrderAmount());
      invoiceHeader.setActive(shoppingCartHeader.getActive());
      invoiceHeader.setInvoiceDate(LocalDateTime.now());
      invoiceHeader.setInvoiceNumber(0);

      invoiceHeader = invoiceRepository.save(invoiceHeader);

      List<InvoiceItems> invoiceItems = new ArrayList<InvoiceItems>();

      for (ShoppingCartItems itemsAux : shoppingCartItems) {

        InvoiceItems invoiceItemAux = new InvoiceItems();

        invoiceItemAux.setIdInvoice(invoiceHeader.getId());
        invoiceItemAux.setDescription(itemsAux.getDescription());
        invoiceItemAux.setIdProduct(itemsAux.getIdProduct());
        invoiceItemAux.setPrice(itemsAux.getPrice());
        invoiceItemAux.setQty(itemsAux.getQty());
        invoiceItemAux.setTotal(itemsAux.getTotal());
        invoiceItemAux.setOrderNumber(0);
        invoiceItemAux.setOrderRow(0);
        invoiceItemAux.setRow(0);

        invoiceItems.add(invoiceItemAux);
      }

      invoiceItems = invoiceItemsRepository.saveAll(invoiceItems);

      InvoiceWrapper invoiceWrapper = new InvoiceWrapper();
      invoiceWrapper.setInvoiceHeader(invoiceHeader);
      invoiceWrapper.setInvoiceItems(invoiceItems);

      return invoiceWrapper;

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
          "Error al crear factura de compras");
    }

  }



}
