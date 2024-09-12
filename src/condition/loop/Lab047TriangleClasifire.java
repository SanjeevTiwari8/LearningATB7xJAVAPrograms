package condition.loop;

import java.util.Scanner;

public class Lab047TriangleClasifire {
    public static void main(String[] args) {
        Scanner scanValue= new Scanner(System.in);
        System.out.println("Enter length of First side of Trangle");
        int side1=scanValue.nextInt();

        System.out.println("Enter length of Second side of Trangle");
        int side2=scanValue.nextInt();

        System.out.println("Enter length of Third side of Trangle");
        int side3=scanValue.nextInt();

        if (side1==side2 && side2==side3)
        {
            System.out.println("This Triangle is equilateral");

        } else if (side1==side2 ||side2==side3 || side3==side1) {
            System.out.println("This triangle is isosceles");

        }else {
            System.out.println("This triangle is scalene");
        }
        scanValue.close();
        // if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
    }
}
