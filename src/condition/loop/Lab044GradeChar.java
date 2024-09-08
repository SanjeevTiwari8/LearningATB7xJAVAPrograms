package condition.loop;

import java.util.Scanner;

public class Lab044GradeChar {
    public static void main(String[] args) {
        Scanner scannerValue=new Scanner(System.in);
        System.out.println("Please enter a number");


        int firstGradeNumber= scannerValue.nextInt();
        char Grade='F';

        if (firstGradeNumber>=90 && firstGradeNumber<=100)
        {
            Grade='A';
        } else if (firstGradeNumber>=80 && firstGradeNumber<=89)
        {
            Grade='B';

        } else if (firstGradeNumber>=70 && firstGradeNumber<=79) {
            Grade='C';

        } else if (firstGradeNumber>=60 && firstGradeNumber<=69) {
            Grade='D';

        } else if (firstGradeNumber>=0 && firstGradeNumber<=59) {
            Grade='F';

        }else {
            Grade='N';
            System.out.println("Please enter the Marks value between 0-100 to calculate Grade, Note--> 'N'= Score is not clear");
        }
        System.out.println("Your Grade Score Is: "+ Grade);
    }
}


