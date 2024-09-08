package condition.loop;

import java.util.Scanner;

public class Lab039WithScanner {
    public static void main(String[] args) {
        Scanner newScannervalue= new Scanner(System.in);
        System.out.println("Enter the number");
        int readScannervalue=newScannervalue.nextInt();
        if (readScannervalue%5==0)
        {
            System.out.println("Divided Perfectly");
        }else {
            System.out.println("Not divided correctly");
        }
    }
}
