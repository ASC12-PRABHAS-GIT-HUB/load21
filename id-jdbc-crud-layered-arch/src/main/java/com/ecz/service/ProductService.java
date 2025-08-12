package com.ecz.service;

import com.ecz.model.product;

import java.util.List;

public interface ProductService
{
    public boolean addProduct(product product);
    public List<product> getAllProducts();
    boolean updateProduct(product product);


}
