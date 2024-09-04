package learning.datatype;

public class Lab018 {
    public static void main(String[] args) {
        // unary operators - only one operand and operator.
        // data_type variable_name(identifier)= variable_value(literal);
        int age=15;
        int card=-15;
        //age-operand, value - unary plus= operator.
        //age-operand, value - unary minus= operator.

        // binary operators-
        int a=10;
        int b=20;
        int sum = a+b;
        // binary = arithmetic ( +,-,*,/)
        //two operand.(a,b)

        //ternary operator a,b,c

        // Truncation-
        /*You might expect the result to be 3.5, but because both numbers are integers, truncation occurs, and the fractional part (.5) is dropped. The result stored in result will be 3 instead of 3.5.

                How to Avoid Truncation:
        To avoid truncation, you can cast one of the numbers to a floating-point type (like double or float), which allows the fractional part to be preserved:

        java
        Copy code
        double result = 7 / 2.0;  // Using a floating-point number
        This will correctly output 3.5 because the division is now done with a floating-point number.

                In your code, the expression (((a * b) / c) * d) could suffer from truncation if you don’t handle the division carefully, as a * b and c are integers. By casting one of them to double, you avoid truncation.*/










    }
}