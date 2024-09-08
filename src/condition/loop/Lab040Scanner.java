package condition.loop;

import java.util.Scanner;

public class Lab040Scanner {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Give your value in the list");

        int readValue=newScanner.nextInt();
        if (readValue>45 && readValue <200) //(readValue>=45 && readValue <=200) if you add this condition with equal to, then second condition will be false always, because if any value is 45 or 200 , it will always excute first condition, 2nd condition will never be executed.        {
        { System.out.println("Value is under limit, input value :" + readValue);
        }else if (readValue==45 || readValue==200)
        {
            System.out.println("Value is matching condition, input value :"+ readValue);
        }
        else {
            System.out.println("Input not matching with conditions :" + readValue);
        }


    }
}
