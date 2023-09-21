package org.yurii.ooaplabs.laba2;

import org.yurii.ooaplabs.laba2.jewelries.Earrings;
import org.yurii.ooaplabs.laba2.jewelries.Rings;
import org.yurii.ooaplabs.laba2.jewelryFactories.GoldJewelryFactory;
import org.yurii.ooaplabs.laba2.jewelryFactories.JewelryFactory;
import org.yurii.ooaplabs.laba2.jewelryFactories.SilverJewelryFactory;

public class JewelryCatalog {
    public static void main(String[] args) {
        // Створюємо фабрики для золотих та срібних виробів
        JewelryFactory goldFactory = new GoldJewelryFactory();
        JewelryFactory silverFactory = new SilverJewelryFactory();

        // Створюємо золоті та срібні вироби
        Earrings goldEarrings = goldFactory.createEarrings();
        Earrings silverEarrings = silverFactory.createEarrings();
        Rings goldRings = goldFactory.createRing();
        Rings silverRings = silverFactory.createRing();
        // Додайте створення інших виробів за аналогічною схемою

        // Виводимо інформацію про вироби в каталозі
        System.out.println("Золоті вироби:");
        System.out.println("1. " + goldEarrings.getPrice() + ", Матеріал: " + goldEarrings.getMaterial() + ", Ціна: " + goldEarrings.getPrice());
        System.out.println("2. " + goldRing.getType() + ", Матеріал: " + goldRing.getMaterial() + ", Ціна: " + goldRing.getPrice());
        // Додайте вивід інших виробів за аналогічною схемою

        System.out.println("Срібні вироби:");
        System.out.println("1. " + silverEarrings.getType() + ", Матеріал: " + silverEarrings.getMaterial() + ", Ціна: " + silverEarrings.getPrice());
        System.out.println("2. " + silverRing.getType() + ", Матеріал: " + silverRing.getMaterial() + ", Ціна: " + silverRing.getPrice());
        // Додайте вивід інших срібних виробів за аналогічною схемою
    }
}
