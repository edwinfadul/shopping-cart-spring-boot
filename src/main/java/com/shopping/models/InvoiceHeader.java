package com.shopping.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Invoiceheader")
public class InvoiceHeader {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "invoicenumber")
  private Integer invoiceNumber;

  @Column(name = "idcustomer")
  private Integer idCustomer;

  @Column(name = "invoicedate")
  private LocalDateTime invoiceDate;

  @Column(name = "invoiceamount")
  private BigDecimal invoiceAmount;

  @Column(name = "active")
  private Boolean active;

  public InvoiceHeader() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(Integer invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Integer getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
  }

  public LocalDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(LocalDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public BigDecimal getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(BigDecimal invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

}
