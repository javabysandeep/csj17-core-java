package conditionalStatements;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if ((a > b) && (a > c)) {
            System.out.println("A is greater" + a);
        } else if ((b > a) && (b > c)) {
            System.out.println("B is greater " + b);
        } else {
            System.out.println(" C is greater " + c);
        }

        //conditional operator
        System.out.println(((a > b) && (a > c))
                ? "A is greater " + a
                : ((b > a) && (b > c))
                    ? "b is greater" + b
                    : "c is greater " + c);
    }
}
