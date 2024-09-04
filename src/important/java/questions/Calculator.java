package important.java.questions;

public class Calculator {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=40;
        float d=55.50f;
        double e=5485;
        int sumOfTwoNumbers = a + b;
        int modulesOfNumbers = c%b;
        int sumOfThreeNumbers = a + b + c;
        int productOfThreeNumbers = a * b * c;
        int resultAfterSubtraction = (a * b) - c;
        double calculatedDoubleValue = (((a * b) / (double)c) * d) - e;  // Cast for accuracy
        float sumOfIntAndFloat = a + d;  // Optionally cast a to float for clarity

        System.out.println("Subtraction Result: " + resultAfterSubtraction);
        System.out.println("modulesOfNumbers Result: " + modulesOfNumbers);
        System.out.println("Sum of Two Numbers: " + sumOfTwoNumbers);
        System.out.println("Sum of Three Numbers: " + sumOfThreeNumbers);
        System.out.println("Product of Three Numbers: " + productOfThreeNumbers);
        System.out.println("Calculated Double Value: " + calculatedDoubleValue);
        System.out.println("Sum of Int and Float: " + sumOfIntAndFloat);
    }
}
