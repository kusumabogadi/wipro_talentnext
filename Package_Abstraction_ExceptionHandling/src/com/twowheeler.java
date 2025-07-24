package com;

import java.util.Scanner;

// Abstract base class
abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

// Hero subclass
class Hero extends Vehicle {
    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS01AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Sunshine";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON in Hero.");
    }
}

// Honda subclass
class Honda extends Vehicle {
    @Override
    public String getModelName() {
        return "Honda Shine";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS01CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Bhagyasri";
    }

    public int getSpeed() {
        return 90;
    }

    public void cdPlayer() {
        System.out.println("CD player is ON in Honda.");
    }
}

// Main class; must match the filename
public class twowheeler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a vehicle type:");
        System.out.println("1. Hero");
        System.out.println("2. Honda");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Hero hero = new Hero();
                System.out.println("Model Name: " + hero.getModelName());
                System.out.println("Registration Number: " + hero.getRegistrationNumber());
                System.out.println("Owner Name: " + hero.getOwnerName());
                System.out.println("Speed: " + hero.getSpeed() + " km/h");
                hero.radio();
                break;
            case 2:
                Honda honda = new Honda();
                System.out.println("Model Name: " + honda.getModelName());
                System.out.println("Registration Number: " + honda.getRegistrationNumber());
                System.out.println("Owner Name: " + honda.getOwnerName());
                System.out.println("Speed: " + honda.getSpeed() + " km/h");
                honda.cdPlayer();
                break;
            default:
                System.out.println("Invalid vehicle type selected.");
        }

        sc.close();
    }
}
