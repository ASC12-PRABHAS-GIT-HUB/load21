package com.ecz.model;

public class product {
    private String id;
    private String name;
    private double price;
    private int quamtity;

    public product(String id, String name,double price,int quamtity){
        this.id = id;
        this.name= name;
        this.price=price;
        this.quamtity=quamtity;
    }

    public String getId(){
        return id;
    }

    public void setID(String id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.length()==0){
            RuntimeException nameInvalidException= new RuntimeException("name cant be empty");
            throw nameInvalidException;
        }
    }

    public double setprice(double price){
        this.price= price;
    }
    public double getPrice(){
        return price;
    }
    public int getQuamtity(){

    }
    public void setQuamtity(int quamtity){

    }
    @Override
    public String toString(){
        return "Product Details:"+
                "id = " +id+ "\t"+
                "name ="+name+"\t"+
                "price ="+price+"\t"+
                "quantity ="+ quamtity+"\t";
    }
}
