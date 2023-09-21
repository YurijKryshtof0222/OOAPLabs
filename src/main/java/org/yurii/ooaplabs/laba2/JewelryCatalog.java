package org.yurii.ooaplabs.laba2;

import org.yurii.ooaplabs.laba2.jewelries.AbstarctJewelry;
import org.yurii.ooaplabs.laba2.jewelries.Earrings;
import org.yurii.ooaplabs.laba2.jewelries.Rings;
import org.yurii.ooaplabs.laba2.jewelryFactories.GoldJewelryFactory;
import org.yurii.ooaplabs.laba2.jewelryFactories.JewelryFactory;
import org.yurii.ooaplabs.laba2.jewelryFactories.SilverJewelryFactory;

import java.util.ArrayList;
import java.util.List;

public class JewelryCatalog {
    public static void main(String[] args) {
        // Створюємо фабрики для золотих та срібних виробів
        JewelryFactory goldFactory = new GoldJewelryFactory();
        JewelryFactory silverFactory = new SilverJewelryFactory();

        Earrings goldEarrings = goldFactory.createEarrings();
        Earrings silverEarrings = silverFactory.createEarrings();
        Rings goldRing = goldFactory.createRing();
        Rings silverRings = silverFactory.createRing();

        List<AbstarctJewelry> catalog = new ArrayList<>();
        catalog.add(goldEarrings);
        catalog.add(silverEarrings);
        catalog.add(goldRing);
        catalog.add(silverRings);

        showCatalog(catalog);
    }

    public static void showCatalog(List<AbstarctJewelry> catalog) {
        int i = 1;
        for (AbstarctJewelry item : catalog) {
            System.out.println(Integer.toString(i++) + " " + item.getTypeName() + ", Матеріал: " + item.getMaterialName() + ", Ціна: " + item.getPrice());
        }
    }
}