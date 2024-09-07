package learning.datatype;

public class Lab032StringSecond {
    public static void main(String[] args) {
        String strFirst= new String("Java tester");// 1-this string created in heap
        String strSecond= new String("Java tester");// 2-this string created in heap
        String strThird= new String("Java tester");// 3-this string created in heap

        System.out.println(strFirst==strSecond); // check for reference
        System.out.println(strFirst==strThird); // check for reference
        System.out.println(strFirst.equals(strThird));//check for the content
        System.out.println(strFirst.equals(strThird==strThird));
    }
}
