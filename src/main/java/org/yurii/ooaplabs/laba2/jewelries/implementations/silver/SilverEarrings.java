package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Earrings;
import org.yurii.ooaplabs.laba2.util.MaterialType;


public class SilverEarrings extends Earrings {

    public SilverEarrings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverEarrings(double weight) {
        super(weight);
    }

    public SilverEarrings() {
        super(10);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }
}
