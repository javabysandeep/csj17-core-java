package arrayDemos;

public class ArrayBasics {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        for (int element : array) {
            System.out.println(element);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(array2.length);
        for (int a : array2) {
            System.out.println(a);
        }

        int[] a, b, c;
        a = new int[5];
        b = new int[5];
        c = new int[5];

        int [] x, y, z;
        x = new int[5];
        y = new int[5];
        z = new int[5];


    }
}
