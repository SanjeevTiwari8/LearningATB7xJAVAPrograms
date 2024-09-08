package condition.loop;

import java.util.Scanner;

public class Lab041EvenOdd {
    public static void main(String[] args) {

    Scanner newScanner= new Scanner(System.in);
        System.out.println("Enter number to check even or odd");
    int intNew=newScanner.nextInt();
    if (intNew%2==0)
    {
        System.out.println("This number is even");
    }else {
        System.out.println("This number is odd");
    }
    newScanner.close();
    }

}
