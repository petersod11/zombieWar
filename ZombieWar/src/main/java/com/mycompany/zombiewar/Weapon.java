package com.mycompany.zombiewar;

import java.util.Random;

public class Weapon {
    private String final NAME;
    private int final DAMAGE;
    private double final ACCURACY;

    public Weapon() {
        // Generate a random weapon.
        Random random = new Random();
        int number = random.nextInt(7);
        switch (number) {
            case 0:
                NAME = "Shotgun";
                DAMAGE = 30;
                ACCURACY = 60;
                break;
            case 1:
                NAME = "Submachine Gun";
                DAMAGE = 20;
                ACCURACY = 80;
                break;
            case 2:
                NAME = "Assault Rifle";
                DAMAGE = 25;
                ACCURACY = 98;
                break;
            case 3:
                NAME = "Pistol";
                DAMAGE = 10;
                ACCURACY = 90;
                break;
            case 4:
                NAME = "Axe";
                DAMAGE = 8;
                ACCURACY = 100;
                break;
            case 5:
                NAME = "Crowbar";
                DAMAGE = 5;
                ACCURACY = 100;
                break;
            case 6:
                NAME = "Frying Pan";
                DAMAGE = 2;
                ACCURACY = 100;
                break;
        }
    }

    public boolean isTrueShot() {
        Random random = new Random();
        int number = random.nextInt(100);
        if (ACCURACY > number) {
            return true;
        }
        return false;
    }

    public String getName() {
        return NAME;
    }

    public int getDamage() {
        return DAMAGE;
    }
}