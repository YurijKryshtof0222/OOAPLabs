package org.yurii.ooaplabs.laba3;

import org.yurii.ooaplabs.laba3.product.Product;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesCounter {
    private static final SalesCounter instance = new SalesCounter();

    private final HashMap<Class<? extends Product>, ArrayList<Product>> productsMap;

    private SalesCounter() {
        productsMap = new HashMap<>();
    }

    public static SalesCounter getInstance() {
        return instance;
    }

    public void soldProduct(Product product) {
        Class<? extends Product> clazz = product.getClass();
        productsMap.computeIfAbsent(clazz, k -> new ArrayList<>());
        List<Product> list = productsMap.get(clazz);
        list.add(product);
    }

    public int getSoldUnitsNumberOf(Class<? extends Product> clazz) {
        if (productsMap.get(clazz) == null) {
            return 0;
        }
        return productsMap.get(clazz).size();
    }

    public int getSoldUnitsNumberOfAll() {
        int result = 0;
        for (List<Product> list: productsMap.values()) {
            result += list.size();
        }
        return result;
    }

    public int getSumCostOf(Class<? extends Product> clazz) {
        if (productsMap.get(clazz) == null) {
            return 0;
        }
        int result = 0;
        for (Product product: productsMap.get(clazz)) {
            result += product.getPrice();
        }
        return result;
    }

    public int getSumCostAll() {
        int result = 0;
        for (List<Product> list: productsMap.values()) {
            for (Product product: list) {
                result += product.getPrice();
            }
        }
        return result;
    }

    public void writeToFile(String filename) throws IOException {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter("log.txt"))) {
            for (Map.Entry<Class<? extends Product>, ArrayList<Product>> entrySet : productsMap.entrySet()) {
                Class<? extends Product> className = entrySet.getKey();
                String productName = className.getSimpleName();
                bf.append(productName).append("\n");
                ArrayList<Product> list = entrySet.getValue();
                bf.append("Units sold: ").append(String.valueOf(list.size()));
                bf.append("\n");
                for (Product product: list) {
                    bf      .append("Sold Date: ")
                            .append(String.valueOf(product.getDateOfSold()))
                            .append(", Price:")
                            .append(String.valueOf(product.getPrice()))
                            .append("$;\n");
                }
                bf.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}