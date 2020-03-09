package com.shopping.models;

import java.util.List;

public class ShoppingCartWrapper {

  private ShoppingCartHeader shoppingCartHeader;

  private List<ShoppingCartItems> shoppingCartItems;

  public ShoppingCartHeader getShoppingCartHeader() {
    return shoppingCartHeader;
  }

  public void setShoppingCartHeader(ShoppingCartHeader shoppingCartHeader) {
    this.shoppingCartHeader = shoppingCartHeader;
  }

  public List<ShoppingCartItems> getShoppingCartItems() {
    return shoppingCartItems;
  }

  public void setShoppingCartItems(List<ShoppingCartItems> shoppingCartItems) {
    this.shoppingCartItems = shoppingCartItems;
  }

}
