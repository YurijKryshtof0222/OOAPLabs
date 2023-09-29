package org.yurii.ooaplabs.laba3.product;

import java.util.Date;
import java.util.List;

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
