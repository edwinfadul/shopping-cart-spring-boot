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
@Table(name = "Shoppingcartheader")
public class ShoppingCartHeader {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "ordernumber")
  private Integer orderNumber;

  @Column(name = "idcustomer")
  private Integer idCustomer;

  @Column(name = "orderdate")
  private LocalDateTime orderDate;

  @Column(name = "orderamount")
  private BigDecimal orderAmount;

  @Column(name = "iscredit")
  private Boolean isCredit;

  @Column(name = "active")
  private Boolean active;
  
  public ShoppingCartHeader() {
    
  }

  public Integer getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(Integer orderNumber) {
    this.orderNumber = orderNumber;
  }

  public Integer getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = LocalDateTime.now();
  }

  public BigDecimal getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(BigDecimal orderAmount) {
    this.orderAmount = orderAmount;
  }

  public Boolean getIsCredit() {
    return isCredit;
  }

  public void setIsCredit(Boolean isCredit) {
    this.isCredit = isCredit;
  }

  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
