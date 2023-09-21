package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Bracelet;
import org.yurii.ooaplabs.laba2.jewelries.SliverJewelry;

public class SilverBracelet extends SliverJewelry implements Bracelet {
    public SilverBracelet(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverBracelet(double weight) {
        super(weight);
    }

    public SilverBracelet() {
        super(20);
    }
}
