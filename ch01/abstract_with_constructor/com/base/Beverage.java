package com.base;

abstract class AbstractBeverage {
    protected double price;

    public abstract void setPrice(double price);

    public AbstractBeverage(double price) {
        setPrice(price);
    }
}

class Tea extends AbstractBeverage {
    private boolean milk;

    public void setPrice(double price) {
        this.price = price;
    }

    public Tea(boolean milk) {
        super(10.00);
        this.milk = milk;
    }
}

public class Beverage {
    public void function() {
        Tea tea = new Tea(false);
    }
}