package jumpStatements;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("rest of the code");
        System.out.println(add(2, 3));
        return;
    }

    public static int add(int a, int b) {

        return a + b;
    }
}
