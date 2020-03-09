package com.shopping.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shopping.models.ShoppingCartItems;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCartItems, Integer> {

  public ShoppingCartItems findByIdOrderAndIdProduct(Integer idOrder, Integer idProduct);

  public List<ShoppingCartItems> findAllByIdOrder(Integer idOrder);
}
