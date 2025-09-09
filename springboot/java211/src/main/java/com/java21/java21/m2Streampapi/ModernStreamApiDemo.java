package com.java21.java21.m2Streampapi;

import java.math.BigDecimal;

public class ModernStreamApiDemo {
}
class Transaction{
    private final String id;
    private final BigDecimal amount;

    public Transaction(String id,BigDecimal amount){
        this.id=id;
        this.amount=amount;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        return "Transaction{"+"amount="+amount+"id='"+id+'\''+'}';
    }
}
