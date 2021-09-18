package repeatStatements;

public class Pattern3 {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 0; i < number; i++) {

            for (int j = number - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
