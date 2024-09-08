package condition.loop;

import java.util.Scanner;

public class Lab045GradecalClass {
    public static void main(String[] args) {
        Scanner scannerValue = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int firstGradeNumber = scannerValue.nextInt();

        // Check if the input is valid (between 0 and 100)
        if (firstGradeNumber < 0 || firstGradeNumber > 100) {
            System.out.println("Please enter a valid marks value between 0-100 to calculate Grade.");
            return; // Stop further execution since the input is invalid
        }

        // Determine the grade based on the input
        if (firstGradeNumber >= 90) {
            System.out.println("Your Grade Score Is: A");
        } else if (firstGradeNumber >= 80) {
            System.out.println("Your Grade Score Is: B");
        } else if (firstGradeNumber >= 70) {
            System.out.println("Your Grade Score Is: C");
        } else if (firstGradeNumber >= 60) {
            System.out.println("Your Grade Score Is: D");
        } else {
            System.out.println("Your Grade Score Is: F");
        }
    }
}


