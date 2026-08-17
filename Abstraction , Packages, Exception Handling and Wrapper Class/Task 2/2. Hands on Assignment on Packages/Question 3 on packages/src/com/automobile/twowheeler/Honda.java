package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Honda City";
    }

    @Override
    public String getRegistrationNumber() {
        return "TN38CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Arun";
    }

    public int getSpeed() {
        return 100;
    }

    public void cdplayer() {
        System.out.println("CD Player is switched on");
    }
}

