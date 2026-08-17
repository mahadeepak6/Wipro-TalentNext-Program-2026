package com.automobile.test;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("Hero Model: " + hero.getModelName());
        System.out.println("Hero Registration: " + hero.getRegistrationNumber());
        System.out.println("Hero Owner: " + hero.getOwnerName());
        System.out.println("Hero Speed: " + hero.getSpeed());

        hero.radio();

        System.out.println();

        Honda honda = new Honda();

        System.out.println("Honda Model: " + honda.getModelName());
        System.out.println("Honda Registration: " + honda.getRegistrationNumber());
        System.out.println("Honda Owner: " + honda.getOwnerName());
        System.out.println("Honda Speed: " + honda.getSpeed());

        honda.cdplayer();
    }
}


