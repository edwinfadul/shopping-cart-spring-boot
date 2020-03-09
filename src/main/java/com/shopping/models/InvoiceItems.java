package com.shopping.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Invoiceitems")
public class InvoiceItems {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "idinvoice")
  private Integer idInvoice;

  @Column(name = "idproduct")
  private Integer idProduct;

  @Column(name = "description")
  private String description;

  @Column(name = "qty")
  private Integer qty;

  @Column(name = "price")
  private BigDecimal price;

  @Column(name = "total")
  private BigDecimal total;

  @Column(name = "ordernumber")
  private Integer orderNumber;

  @Column(name = "orderrow")
  private Integer orderRow;

  @Column(name = "row")
  private Integer row;

  public InvoiceItems() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdInvoice() {
    return idInvoice;
  }

  public void setIdInvoice(Integer idInvoice) {
    this.idInvoice = idInvoice;
  }

  public Integer getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Integer idProduct) {
    this.idProduct = idProduct;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public Integer getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }

  public Integer getOrderRow() {
    return orderRow;
  }

  public void setOrderRow(Integer orderRow) {
    this.orderRow = orderRow;
  }

  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

}
