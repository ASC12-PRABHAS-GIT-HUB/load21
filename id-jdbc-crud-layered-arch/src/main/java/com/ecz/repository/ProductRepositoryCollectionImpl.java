package com.ecz.repository;
import com.ecz.model.product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryCollectionImpl implements productRepository{
    Map<String,product> cart = new HashMap<>();
    public boolean addProductToCart(product product){
        cart.put(product.getId(),product);

        System.out.println("updated cart is:"+cart);
        return true;
    }
    @Override
    public List<product> getAllProducts(){
        throw new UnsupportedOperationException("not implemented yet");
    }
}
