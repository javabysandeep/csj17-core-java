package conditionalStatements;

public class MultipleOfFive {
    public static void main(String[] args) {
        int number = 23;
        System.out.println((number % 5) == 0 ? "multiple of 5" : "not a multiple");
        if((number % 5) == 0 ) {
            System.out.println("multiple of 5");
        } else {
            System.out.println("not a multiple of 5x");
        }
    }
}
