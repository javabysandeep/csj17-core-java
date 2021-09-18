package arrayDemos;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][][] array = new int[2][][];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i] + ",");
            }
            System.out.println();
        }
    }
}
