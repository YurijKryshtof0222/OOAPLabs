package org.yurii.ooaplabs.laba3.product;

import java.util.Random;

public class Medicine extends Product {

    @Override
    protected int calculatePrice() {
        return (int)(new Random().nextInt(20, 100) * 1.1);
    }

}
