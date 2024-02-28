package org.yurii.ooaplabs.semestry1.laba1;

public final class OwnedCarInfo {
    private String registrationNumber;
    private Car car;
    private Person currOwner;
    private Person prevOwner;

    public OwnedCarInfo(String registrationNumber, Car car, Person currOwner, Person prevOwner) {
        this.registrationNumber = registrationNumber;
        this.car = car;
        this.currOwner = currOwner;
        this.prevOwner = prevOwner;
    }

    public OwnedCarInfo(String registrationNumber, Car car, Person currOwner) {
        this.registrationNumber = registrationNumber;
        this.car = car;
        this.currOwner = currOwner;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Person getCurrOwner() {
        return currOwner;
    }

    public Person getPrevOwner() {
        return prevOwner;
    }

    public Car getCar() {
        return car;
    }

    public boolean hasPrevOwner() {
        return prevOwner != null;
    }

    public void setCurrOwner(Person currOwner) {
        this.prevOwner = this.currOwner;
        this.currOwner = currOwner;
    }

    @Override
    public String toString() {
        return "OwnedCarInfo{" +
                "car=" + car +
                ", currOwner='" + currOwner + '\'' +
                ", prevOwner= " + (hasPrevOwner() ? "'" + prevOwner + "'" : "absent") +
                '}';
    }

}
