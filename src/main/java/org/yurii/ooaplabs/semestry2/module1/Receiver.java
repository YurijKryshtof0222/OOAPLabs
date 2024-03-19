package org.yurii.ooaplabs.semestry2.module1;

public class Receiver {
    private String name;
    private String country;
    private boolean hasPayPalAccount;

    public Receiver(String name, String country, boolean hasPayPalAccount) {
        this.name = name;
        this.country = country;
        this.hasPayPalAccount = hasPayPalAccount;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public boolean hasPayPalAccount() {
        return hasPayPalAccount;
    }
}

