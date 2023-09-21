package org.yurii.ooaplabs.laba2.jewelries.implementations.silver;

import org.yurii.ooaplabs.laba2.jewelries.Earrings;
import org.yurii.ooaplabs.laba2.jewelries.SilverJewelry;
import org.yurii.ooaplabs.laba2.util.MaterialType;

// Реалізація різних видів срібних виробів
public class SilverEarrings extends Earrings implements SilverJewelry {

    public SilverEarrings(double weight, double difficultyFactor) {
        super(weight, difficultyFactor);
    }

    public SilverEarrings(double weight) {
        super(weight);
    }

    @Override
    public MaterialType getMaterial() {
        return MaterialType.SILVER;
    }

    public SilverEarrings() {
        super(10);
    }
}
