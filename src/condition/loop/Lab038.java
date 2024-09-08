package condition.loop;

public class Lab038 {
    public static void main(String[] args) {
         int intNew = 59; // jere we are using modulus = means if any value divide perfect
         if (intNew%2==0)
         {
             System.out.println("Perfect divide");
         }
         if (intNew%5==0)
         {
             System.out.println("Divide by 5");
         }else {
             System.out.println("No Result");
         }
    }
}
