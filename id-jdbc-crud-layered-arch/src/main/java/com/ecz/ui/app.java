package com.ecz.ui;

import java.awt.*;

public class app {
    public static void main(String args[]){
        System.out.println("welcome to ecommerce app!");
        MenuUI menuUI = new MenuUI();
        menuUI.updateProduct();
        menuUI.getAllProducts();
    }
}
