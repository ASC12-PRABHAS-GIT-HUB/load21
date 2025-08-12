package com.ecz.ui;
import com.ecz.model.product;
import com.ecz.service.ProductService;
import com.ecz.service.ProductServiceImpl;

import java.util.List;

public class MenuUI {
    ProductService productService = new ProductServiceImpl();

    void accessMenu(){
        System.out.println("welocme to the appp");
        System.out.println("1.Add product");
        System.out.println("2.View products");
        System.out.println("3.Update product");
        System.out.println("4.Delete product");
        System.out.println("5.Exit");
    }

    void addProduct(){
        product product = new product("1003","laptop",99.99,1);
        boolean isAdded = ProductService.addProduct(product);
        if(isAdded){
            System.out.println("product added successfully");
            //the term dependent and dependee are often used in software design, system eng and dependency management
            //to describe the relation btw components or entities where one relies on another.
        }
        else{
            System.out.println("product not added");
        }
    }

    void getAllProducts(){
        List<product> productList = productService.getAllProducts();
        for (product product: productList){
            System.out.println(product);
        }
    }

    void updateProduct(){
        product product = new product("1","desktop",1999.999,11);
        boolean isUpdated = productService.updateProduct(product);
        if(isUpdated){
            System.out.println("product updated successfully!");
        }
        else{
            System.out.println("product not updated");
        }
    }
}
