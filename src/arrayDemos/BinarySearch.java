package arrayDemos;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {56, 78, 89, 111, 0, 45};
        Arrays.sort(array);

        int key = 89;
        int low = 0;
        int high = array.length - 1;
        while (low < high) {

            int mid = (low + high) / 2;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else if (key == array[mid]) {
                System.out.println("found");
                break;
            }
        }

       /* for (int element : array) {
            System.out.print(element+", ");

        }
        */
    }
}
