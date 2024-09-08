package condition.loop;

public class Lab036 {
    public static void main(String[] args) {
        boolean newBoolean = (!(!false));
        System.out.println(newBoolean);

        if (newBoolean !=true)
        {
            System.out.println("Print out == 100");
        }
        else
        {
            System.out.println("Print out == 0");
        }
    }
}
