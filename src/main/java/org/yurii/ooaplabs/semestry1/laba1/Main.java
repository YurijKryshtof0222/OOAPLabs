package org.yurii.ooaplabs.semestry1.laba1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OwnedCarInfo> registationCarLog = new ArrayList<>();

        registationCarLog.add(new OwnedCarInfo("0A", new Car( "Volvo","x90"), new Person(0, "Oleksiy", "Pryadko")));
        registationCarLog.add(new OwnedCarInfo("1B", new Car( "Nissan","gt-r35"), new Person(1, "Oleh", "Gaba")));
        registationCarLog.add(new OwnedCarInfo("2C", new Car( "Volkswagen","Polo"), new Person(2, "John", "Doe")));
        registationCarLog.add(new OwnedCarInfo("3D", new Car( "ZAZ","Zaporozhets'"), new Person(3, "Mykola", "Salo")));
        registationCarLog.add(new OwnedCarInfo("4E", new Car( "Porsche","Panamera"), new Person(4, "Dumanskiy", "Ostap")));

        for (OwnedCarInfo carInfo: registationCarLog) {
            System.out.println(carInfo);
        }
    }

}