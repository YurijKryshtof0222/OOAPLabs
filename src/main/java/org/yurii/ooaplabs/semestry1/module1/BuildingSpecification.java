package org.yurii.ooaplabs.semestry1.module1;

import java.util.List;

public class BuildingSpecification {

    private int numberOfFloors;
    private double area;
    private List<String> utilities;

    public BuildingSpecification(int numberOfFloors, double area, List<String> utilities) {
        this.numberOfFloors = numberOfFloors;
        this.area = area;
        this.utilities = utilities;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public double getArea() {
        return area;
    }

    public List<String> getUtilities() {
        return utilities;
    }

}
