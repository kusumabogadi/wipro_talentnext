package com;
import java.util.Scanner;
public class automobile {
	
	
	abstract class Vehicle {
	    public abstract String getModelName();
	    public abstract String getRegistrationNumber();
	    public abstract String getOwnerName();
	}

	class Logan extends Vehicle {
	    public String getModelName() {
	        return "Logan";
	    }

	    public String getRegistrationNumber() {
	        return "AP01XY1234";
	    }

	    public String getOwnerName() {
	        return "Sunshine";

	    }

	    public int speed() {
	        return 100;
	    }

	    public void gps() {
	        System.out.println("GPS is ON in Logan.");
	    }
	}

	class Ford extends Vehicle {
	    public String getModelName() {
	        return "Ford Ecosport";
	    }

	    public String getRegistrationNumber() {
	        return "AP01XY5678";
	    }

	    public String getOwnerName() {
	        return "Bhagyasri";
	    }

	    public int speed() {
	        return 120;
	    }

	    public void tempControl() {
	        System.out.println("Air Conditioning is ON in Ford.");
	    }
	}

	public class QuestionPackages04 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Choose a four-wheeler vehicle type:");
	        System.out.println("1. Logan");
	        System.out.println("2. Ford");
	        System.out.println("Enter the four-wheeler vehicle choice: ");
	        int choice = sc.nextInt();

	        if (choice == 1) {
	            Logan logan = new Logan();
	            System.out.println("Model Name: " + logan.getModelName());
	            System.out.println("Registration Number: " + logan.getRegistrationNumber());
	            System.out.println("Owner Name: " + logan.getOwnerName());
	            System.out.println("Speed: " + logan.speed() + " km/h");
	            logan.gps();
	        } else if (choice == 2) {
	            Ford ford = new Ford();
	            System.out.println("Model Name: " + ford.getModelName());
	            System.out.println("Registration Number: " + ford.getRegistrationNumber());
	            System.out.println("Owner Name: " + ford.getOwnerName());
	            System.out.println("Speed: " + ford.speed() + " km/h");
	            ford.tempControl();
	        } else {
	            System.out.println("Invalid vehicle type selected.");
	        }

	        sc.close();
	    }
	}


}
