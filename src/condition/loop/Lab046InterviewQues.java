package condition.loop;

public class Lab046InterviewQues {
    public static void main(String[] args) {

        //Here first section all the condition of it is true so it will print (1 2 3 in every next line, not on ame line).

        if (true) {
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
        //===========================================================================
        //Here Second section only two conditions of it is true so it will print (1 2  in every next line, not on ame line)
        if (true) {
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (false) {
                    System.out.println("3");
                }
            }
        }
        //==================================================================================
        //Here third section only one condition of it is true so it will print 1 not other part of the code
        if (true) {
            System.out.println("1");
            if (false) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
        //=====================================================================
        //Here fourth section first condition of it is false so it will not print, will print null there.
        if (false) {
            System.out.println("1");
            if (true) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }





    }
}
