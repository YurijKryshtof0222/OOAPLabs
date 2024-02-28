package org.yurii.ooaplabs.semestry1.module1;

public class Building {
    private BuildingSpecification buildingSpecification;
    private Owner owner;

    public Building(BuildingSpecification buildingSpecification, Owner owner) {
        this.buildingSpecification = buildingSpecification;
        this.owner = owner;
    }

    public Owner getOwner() {
        return owner;
    }

    public BuildingSpecification getBuildingSpecification() {
        return buildingSpecification;
    }

    public String getBuildingInfo() {
        return "Технічні характеристики будівлі:\n" +
                "Кількість поверхів: " + buildingSpecification.getNumberOfFloors() + "\n" +
                "Площа: " + buildingSpecification.getArea() + " кв. м.\n" +
                "Підведені комунікації: " + buildingSpecification.getUtilities() + "\n" +
                "Власник будівлі:\n" +
                "Назва підприємства: " + owner.getCompanyName() + "\n" +
                "Адреса: " + owner.getAddress();
    }
}