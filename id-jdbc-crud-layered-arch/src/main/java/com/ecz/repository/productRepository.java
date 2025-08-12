package com.ecz.repository;

import com.ecz.model.product;

import java.util.List;
public interface productRepository {
    boolean addProductToCart(product product);
    List<product> getAllProducts();
}
