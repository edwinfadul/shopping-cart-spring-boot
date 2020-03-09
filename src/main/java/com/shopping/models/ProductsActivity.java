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
@Table(name = "Productsactivity")
public class ProductsActivity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idproduct;

  @Column(name = "idcustomer")
  private Integer idCustomer;

  @Column(name = "typetransaction")
  private String typeTransaction;

  @Column(name = "activitynumber")
  private String activityNumber;

  @Column(name = "activitydate")
  private LocalDateTime activityDate;

  @Column(name = "activityamount")
  private BigDecimal ActivityAmount;

  @Column(name = "productqty")
  private Integer productQty;

  public Integer getIdproduct() {
    return idproduct;
  }

  public void setIdproduct(Integer idproduct) {
    this.idproduct = idproduct;
  }

  public Integer getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Integer idCustomer) {
    this.idCustomer = idCustomer;
  }

  public String getTypeTransaction() {
    return typeTransaction;
  }

  public void setTypeTransaction(String typeTransaction) {
    this.typeTransaction = typeTransaction;
  }

  public String getActivityNumber() {
    return activityNumber;
  }

  public void setActivityNumber(String activityNumber) {
    this.activityNumber = activityNumber;
  }

  public LocalDateTime getActivityDate() {
    return activityDate;
  }

  public void setActivityDate(LocalDateTime activityDate) {
    this.activityDate = activityDate;
  }

  public BigDecimal getActivityAmount() {
    return ActivityAmount;
  }

  public void setActivityAmount(BigDecimal activityAmount) {
    ActivityAmount = activityAmount;
  }

  public Integer getProductQty() {
    return productQty;
  }

  public void setProductQty(Integer productQty) {
    this.productQty = productQty;
  }

}
