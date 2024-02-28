package org.yurii.ooaplabs.semestry1.module1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> utils1 = new ArrayList<>();
        utils1.add("Електроенергія");
        utils1.add("Вода");
        utils1.add("Газ");
        List<String> utils2 = new ArrayList<>();
        utils2.add("Електроенергія");
        utils2.add("Вода");
        utils2.add("Газ");

        Owner owner1 = new Owner("NOVBUD", "м. Вінниця, вул. Соборна, 34");
        Building building1 = new Building(new BuildingSpecification(3, 195.0, utils1), owner1);

        Owner owner2 = new Owner("Svarog", "м. Львів, вул C. Бандери 37");
        Building building2 = new Building(new BuildingSpecification(5, 250.5, utils2), owner2);

        String buildingInfo1 = building1.getBuildingInfo();
        System.out.println(buildingInfo1);

        System.out.println();

        String buildingInfo2 = building2.getBuildingInfo();
        System.out.println(buildingInfo2);
    }
}
