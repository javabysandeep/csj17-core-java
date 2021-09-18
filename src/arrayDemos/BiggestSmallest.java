package arrayDemos;

import java.util.Arrays;

public class BiggestSmallest {
    public static void main(String[] args) {

        int[] array = {56, 78, 89, 111, 0, 45};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Max: " + max + "\t" + "Min: " + min);
    }
}
