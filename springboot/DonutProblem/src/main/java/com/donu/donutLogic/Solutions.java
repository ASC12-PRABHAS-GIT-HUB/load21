package com.donu.donutLogic;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Solutions {
    public static void main(String[] args) {

        List<Donut> donuts= Arrays.asList(
                new Donut(50,"Choco"),
                new Donut(70,"venila"),
                new Donut(80,"Sprinkle")
        );
        System.out.println("==========Starting to Work==========");

    }
}

class Donut{
    private float price;
    private String type;
    private static float gst=18;

    public Donut(float price, String type) {
        this.price = price;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static float getGst() {
        return gst;
    }

    public static void setGst(float gst) {
        Donut.gst = gst;
    }
}
class DonutRules implements Predicate<Donut>{

    @Override
    public boolean test(Donut donut) {
         return BigDecimal.valueOf(donut.getPrice()+ Donut.getGst()).compareTo(BigDecimal.valueOf(100))<0;
    }


}
