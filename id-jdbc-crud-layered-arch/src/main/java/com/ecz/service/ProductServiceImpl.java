package com.ecz.service;

import com.ecz.model.product;
import com.ecz.repository.ProductRepositoryCollectionImpl;
import com.ecz.repository.productRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    productRepository productRepository= new ProductRepositoryCollectionImpl();

    public boolean addProduct(product product) {
        boolean isAdded=false;
        if (product.getPrice() < 0) {
            System.out.println("price cant be negative");
        } else {
            isAdded = productRepository.addProductToCart(product);
        }
        return isAdded;
    }

    public List<product> getAllProducts(){
        return productRepository.getAllProducts();
    }
    @Override
    public boolean updateProduct(product product){
        throw new UnsupportedOperationException("not implemented yet");
    }
}
