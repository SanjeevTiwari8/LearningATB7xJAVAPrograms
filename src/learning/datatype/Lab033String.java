package learning.datatype;

public class Lab033String {
    public static void main(String[]args){
        String newString="Team Support";
        System.out.println(newString);

        char newChar=newString.charAt(10);
        System.out.println(newChar);

        newString=newString.concat(" Updated");
        System.out.println(newString);

        char newotherChar=newString.charAt(15);
        //char newOt= newString.charAt(newString.length()); something wrong
        //char newOt=newString.charAt(newString.lastIndexOf('e')); something wrong
        //System.out.println(newOt);
        System.out.println(newotherChar);
        System.out.println(newString.length());
        System.out.println(newString.indexOf('u'));
        System.out.println(newString.substring(0,6));

    }
}
