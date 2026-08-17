package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {

    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "TN38AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Deepak";
    }

    public int getSpeed() {
        return 60;
    }

    public void radio() {
        System.out.println("Radio is switched on");
    }
}

