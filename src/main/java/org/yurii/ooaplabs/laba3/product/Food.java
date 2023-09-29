package org.yurii.ooaplabs.laba3.product;

import java.util.List;
import java.util.Random;

public class Food extends Product {

    @Override
    protected int calculatePrice() {
        return (int)(new Random().nextInt(20, 100)  * 1.05);
    }
}
