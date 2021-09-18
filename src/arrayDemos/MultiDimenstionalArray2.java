package arrayDemos;

public class MultiDimenstionalArray2 {
    public static void main(String[] args) {
        int[][] array = new int[2][4];

        int[][] array2 = {
                {1, 1, 1},
                {2, 2, 2, 3, 4}
        };

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
