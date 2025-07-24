package Abstraction;

import java.util.Scanner;

// Abstract class representing a rail coach
abstract class Compartment {
    public abstract String notice();
}

// FirstClass compartment
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class Compartment";
    }
}

// Ladies compartment
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

// General compartment
class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment";
    }
}

// Luggage compartment
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment";
    }
}

// Main class to test compartments
public class QuestionAbstraction01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compartment[] compartments = new Compartment[10];

        System.out.println("Enter compartment type numbers for 10 coaches:");
        System.out.println("1. FirstClass\n2. Ladies\n3. General\n4. Luggage");

        for (int i = 0; i < compartments.length; i++) {
            System.out.print("Enter type for coach " + (i + 1) + ": ");
            int choice = 0;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                sc.next(); // clear invalid input
            }

            switch (choice) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
                default:
                    System.out.println("Invalid choice, assigning General by default.");
                    compartments[i] = new General();
            }
        }

        System.out.println("\nCompartment Notices:");
        for (Compartment c : compartments) {
            System.out.println(c.notice());
        }

        sc.close();
    }
}

