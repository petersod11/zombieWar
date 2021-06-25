package com.mycompany.zombiewar;

import java.util.Random;

public class Weapon {
    private String name;
    private int damage;
    private double accuracy;

    public Weapon() {
        // Generate a random weapon.
        Random random = new Random();
        int number = random.nextInt(7);
        switch (number) {
            case 0:
                name = "Shotgun";
                damage = 30;
                accuracy = 60;
                break;
            case 1:
                name = "Submachine Gun";
                damage = 20;
                accuracy = 80;
                break;
            case 2:
                name = "Assault Rifle";
                damage = 25;
                accuracy = 98;
                break;
            case 3:
                name = "Pistol";
                damage = 10;
                accuracy = 90;
                break;
            case 4:
                name = "Axe";
                damage = 8;
                accuracy = 100;
                break;
            case 5:
                name = "Crowbar";
                damage = 5;
                accuracy = 100;
                break;
            case 6:
                name = "Frying Pan";
                damage = 2;
                accuracy = 100;
                break;
        }
    }

    public boolean isTrueShot() {
        Random random = new Random();
        int number = random.nextInt(100);
        if (this.accuracy > number) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}