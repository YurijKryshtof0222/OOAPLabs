package org.yurii.ooaplabs.laba2.jewelryFactories;

import org.yurii.ooaplabs.laba2.jewelries.*;

// Інтерфейс для фабрики ювелірних виробів
public interface JewelryFactory {
    Earrings createEarrings();
    Rings createRing();
    Necklace createNecklace();
    Pendant createPendant();
    Bracelet createBracelet();
}