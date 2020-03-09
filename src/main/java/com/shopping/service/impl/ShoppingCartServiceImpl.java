package com.shopping.service.impl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.shopping.models.Products;
import com.shopping.models.ShoppingCartHeader;
import com.shopping.models.ShoppingCartItems;
import com.shopping.models.ShoppingCartWrapper;
import com.shopping.repository.ProductRepository;
import com.shopping.repository.ShoppingCartHeaderRepository;
import com.shopping.repository.ShoppingCartRepository;
import com.shopping.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
  @Autowired
  private ShoppingCartHeaderRepository shoppingCartHeaderRepository;

  @Autowired
  private ShoppingCartRepository shoppingCartRepository;

  @Autowired
  private ProductRepository productRepository;

  @Override
  public ShoppingCartWrapper save(ShoppingCartWrapper shoppingCartWrapper) {
    try {

      ShoppingCartHeader shoppingCartHeader = shoppingCartWrapper.getShoppingCartHeader();
      List<ShoppingCartItems> shoppingCartItems = shoppingCartWrapper.getShoppingCartItems();

      for (ShoppingCartItems itemAux : shoppingCartItems) {

        Products product = new Products();
        product = productRepository.findById(itemAux.getIdProduct()).get();

        itemAux.setIdProduct(product.getId());
        itemAux.setRow(0);
        itemAux.setDescription(product.getDescription());
        itemAux.setPrice(product.getPrice());
        itemAux.setTotal(product.getPrice().multiply(new BigDecimal(itemAux.getQty())));

      }

      BigDecimal orderAmount =
          shoppingCartItems.stream().map(ShoppingCartItems::getTotal).reduce(BigDecimal::add).get();

      shoppingCartHeader.setOrderNumber(0);
      shoppingCartHeader.setOrderDate(LocalDateTime.now());
      shoppingCartHeader.setOrderAmount(orderAmount);
      shoppingCartHeader = shoppingCartHeaderRepository.save(shoppingCartHeader);

      for (ShoppingCartItems itemAux : shoppingCartItems) {
        itemAux.setIdOrder(shoppingCartHeader.getId());
      }

      shoppingCartItems = shoppingCartRepository.saveAll(shoppingCartItems);


      shoppingCartWrapper.setShoppingCartHeader(shoppingCartHeader);
      shoppingCartWrapper.setShoppingCartItems(shoppingCartItems);

      return shoppingCartWrapper;

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
          "Error al crear carrito de compras");
    }

  }

  @Override
  public ShoppingCartItems update(ShoppingCartItems item) {

    try {

      ShoppingCartItems shoppingCartItem = shoppingCartRepository.findById(item.getId()).get();

      shoppingCartItem.setQty(item.getQty());
      shoppingCartItem
          .setTotal(shoppingCartItem.getPrice().multiply(new BigDecimal(item.getQty())));

      shoppingCartItem = shoppingCartRepository.save(shoppingCartItem);

      return shoppingCartItem;

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
          "Error al actualizar el carrito de compras");
    }
  }

  @Override
  public Boolean delete(Integer id) {

    try {

      shoppingCartRepository.deleteById(id);

      return true;

    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
          "Error al eliminar el item del carrito de compras");
    }
  }



}
