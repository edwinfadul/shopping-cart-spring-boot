package com.shopping.models;

import java.util.List;

public class InvoiceWrapper {

  private InvoiceHeader invoiceHeader;

  private List<InvoiceItems> invoiceItems;

  public InvoiceHeader getInvoiceHeader() {
    return invoiceHeader;
  }

  public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
    this.invoiceHeader = invoiceHeader;
  }

  public List<InvoiceItems> getInvoiceItems() {
    return invoiceItems;
  }

  public void setInvoiceItems(List<InvoiceItems> invoiceItems) {
    this.invoiceItems = invoiceItems;
  }

}
