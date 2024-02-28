package org.yurii.ooaplabs.semestry1.laba3.product;

import java.util.Date;
public abstract class Product {
    private final int price;
    protected Date dateOfSold;

    public Product() {
        price = calculatePrice();
        dateOfSold = new Date();
    }

    protected abstract int calculatePrice();

    public Date getDateOfSold() {
        return dateOfSold;
    }

    public int getPrice() {
        return price;
    }

}
