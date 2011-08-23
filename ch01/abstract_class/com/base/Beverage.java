package com.base;

abstract class AbstractBeverage {
    private double price;

    public abstract void setPrice(double price);
}

public class Beverage {
    public void function() {
        AbstractBeverage b = new AbstractBeverage();
    }
}