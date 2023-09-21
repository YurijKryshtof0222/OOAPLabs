package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Pendant;
import org.yurii.ooaplabs.laba2.jewelries.SliverJewelry;

public class SilverPendant extends SliverJewelry implements Pendant{
    public SilverPendant(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverPendant(double weight) {
        super(weight);
    }

    public SilverPendant() {
        super(20);
    }
}
