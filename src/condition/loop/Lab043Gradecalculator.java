package condition.loop;

import java.util.Scanner;

public class Lab043Gradecalculator {
    public static void main(String[] args) {
        Scanner scannerValue=new Scanner(System.in);
        System.out.println("Please enter a number");

        int firstGradeNumber= scannerValue.nextInt();

        if (firstGradeNumber>=90 && firstGradeNumber<=100)
        {
            System.out.println("Your Grade Score Is: "+ " A");
        } else if (firstGradeNumber>=80 && firstGradeNumber<=89)
        {
            System.out.println("Your Grade Score Is: "+ "B");
            
        } else if (firstGradeNumber>=70 && firstGradeNumber<=79) {
            System.out.println("Your Grade Score Is: "+ "C");

        } else if (firstGradeNumber>=60 && firstGradeNumber<=69) {
            System.out.println("Your Grade Score Is: "+ "D");

        } else if (firstGradeNumber>=0 && firstGradeNumber<=59) {
            System.out.println("Your Grade Score Is: "+ "F");

        }else {
            System.out.println("Please enter the Marks value between 0-100 to calculate Grade");
        }
    }
}
