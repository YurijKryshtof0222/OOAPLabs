package org.yurii.ooaplabs.semestry1.laba3.product;
import java.util.Random;

public class Clothing extends Product {

    @Override
    protected int calculatePrice() {
        return (int)(new Random().nextInt(20, 100) * 1.15);
    }
}
