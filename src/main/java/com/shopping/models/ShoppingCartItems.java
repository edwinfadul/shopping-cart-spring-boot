package com.shopping.models;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Shoppingcartitems")
public class ShoppingCartItems {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "idorder")
  private Integer idOrder;

  @Column(name = "row", columnDefinition = "integer default 0")
  private Integer row;

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

  public ShoppingCartItems() {}


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIdOrder() {
    return idOrder;
  }

  public void setIdOrder(Integer idOrder) {
    this.idOrder = idOrder;
  }

  public Integer getIdProduct() {
    return idProduct;
  }

  public void setIdProduct(Integer idProduct) {
    this.idProduct = idProduct;
  }

  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
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

}
