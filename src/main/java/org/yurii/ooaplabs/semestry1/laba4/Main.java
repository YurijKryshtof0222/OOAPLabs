package org.yurii.ooaplabs.semestry1.laba4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Yurii", "backend developer", new ContractPaymentMethod(20)));
        list.add(new Employee("Denys", "frontend developer", new HourlyPaymentMethod(42)));

        System.out.println(list);
    }
}
