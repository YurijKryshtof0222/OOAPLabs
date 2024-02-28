package org.yurii.ooaplabs.semestry1.module1;

public class Owner {
    private String companyName;
    private String address;

    public Owner(String companyName, String address) {
        this.companyName = companyName;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }
}