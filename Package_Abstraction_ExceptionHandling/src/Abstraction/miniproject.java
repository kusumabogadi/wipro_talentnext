package Abstraction;

import java.util.Scanner;

public class miniproject {
    static Student[] data;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        data = new Student[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline
            System.out.println("Enter details for student " + (i + 1) + ":");
            
            System.out.print("Enter name (or type 'null' for null name): ");
            String name = sc.nextLine();
            if ("null".equals(name)) {
                name = null;
            }

            System.out.print("Enter number of marks (enter 0 for null marks): ");
            int marksCount = sc.nextInt();
            int[] marks = null;
            if (marksCount > 0) {
                marks = new int[marksCount];
                for (int j = 0; j < marksCount; j++) {
                    System.out.print("Enter mark " + (j + 1) + ": ");
                    marks[j] = sc.nextInt();
                }
            }

            // if both name and marks are null -> student object is null
            if (name == null && marks == null) {
                data[i] = null;
            } else {
                data[i] = new Student(name, marks);
            }
        }

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                String result = report.validate(data[i]);
                if ("VALID".equals(result)) {
                    String grade = report.findGrades(data[i]);
                    data[i].setGrade(grade);
                    System.out.println("Grade for student " + data[i].getName() + ": " + grade);
                }
            } catch (Exception e) {
                System.out.println("Exception for student at index " + i + ": " + e);
            }
        }

        System.out.println("Number of Null Marks Array: " + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Name: " + service.findNumberOfNullName(data));
        System.out.println("Number of Null Objects: " + service.findNumberOfNullObjects(data));

        sc.close();
    }
}
