package repeatStatements;

public class Pattern2 {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= number; i++) {

            for (int k = number - 1; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
