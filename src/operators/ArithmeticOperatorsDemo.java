package operators;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        //1. +, -, *, /, %
        System.out.println(123 + "ABC" + 123);//123ABC123
        System.out.println(123 + 123 + "ABC");//246ABC

        //2. We get ArithmeticException Divide by zero for integers
        //System.out.println(10 / 0); //AE

        //3. We get Infinity for floats if we divide by zero
        //System.out.println(10.0 / 0); //Infinity

        //4. We get Nan for floats if we take % by zero
        System.out.println(10.0 % 0); //Infinity

        /* 5. If we perform operations on different data types combination we get resultant as follows
            int ----> byte, short, int, char
            long ----> byte, short, int, char, long
            float ----> byte, short, int, char,long, float
            double ----> byte, short, int, char,long,float, double
        */

        //6. We can't perform arithmetic operations on boolean. We get compile time error.
        //   System.out.println(true + true); // CT Exception

        //7. + is the only operator overloaded in java which is useful for mathematical addition and string concatenation.
    }
}
