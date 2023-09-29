package org.yurii.ooaplabs.laba3;

import org.yurii.ooaplabs.laba3.product.Clothing;
import org.yurii.ooaplabs.laba3.product.Food;
import org.yurii.ooaplabs.laba3.product.Medicine;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SalesCounter salesCounter = SalesCounter.getInstance();

        salesCounter.soldProduct(new Food());
        salesCounter.soldProduct(new Food());
        salesCounter.soldProduct(new Clothing());
        salesCounter.soldProduct(new Medicine());

        salesCounter.writeToFile("log.txt");
    }
}