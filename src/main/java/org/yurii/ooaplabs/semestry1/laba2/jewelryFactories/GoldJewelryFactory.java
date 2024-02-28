package org.yurii.ooaplabs.semestry1.laba2.jewelryFactories;

import org.yurii.ooaplabs.semestry1.laba2.jewelries.*;
import org.yurii.ooaplabs.semestry1.laba2.jewelries.implementations.gold.*;

// Реалізація фабрики для золотих виробів
public class GoldJewelryFactory implements JewelryFactory {
    @Override
    public Earrings createEarrings() {
        return new GoldEarrings();
    }

    @Override
    public Rings createRing() {
        return new GoldRings();
    }

    @Override
    public Necklace createNecklace() {
        return new GoldNecklace();
    }

    @Override
    public Pendant createPendant() {
        return new GoldPendant();
    }

    @Override
    public Bracelet createBracelet() {
        return new GoldBracelet();
    }
}
