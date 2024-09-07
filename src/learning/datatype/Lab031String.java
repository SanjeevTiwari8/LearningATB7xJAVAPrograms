package learning.datatype;

public class Lab031String {
    public static void main(String[] args) {
        String strFirst="New automation";// here one string created in SCP
        String strSecond="New automation";// Here no new string created in SCP because we are using the same value here.
        String strThird="NEW AUTOMATION";// here it is created new string scp
        String strFour=" ";//here new string create as null scp

        String strFive=new String("New automation");// this string will be created into heap.


        System.out.println(strFirst==strSecond);// check for reference
        System.out.println(strFirst.equals(strSecond));//check for content
        System.out.println(strFirst==strThird);// check for reference
        System.out.println(strFirst.equalsIgnoreCase(strThird));
        System.out.println(strFour==strThird);// check for reference
        System.out.println(strFirst.equals(strFive));
        System.out.println(strThird.equalsIgnoreCase(strFive));
    }
}
