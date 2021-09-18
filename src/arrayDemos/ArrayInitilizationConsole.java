package arrayDemos;

import java.util.Scanner;

public class ArrayInitilizationConsole {
    public static void main(String[] args) {
        System.out.println("Enter the array size");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array values");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int element : array) {
            System.out.print(element + ",");
        }
    }
}
