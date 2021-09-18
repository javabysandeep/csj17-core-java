package arrayDemos;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        System.out.println("Accept matrix1");

        int[][] matrix1 = acceptMatrix();

        System.out.println("Accept matrix2");
        int[][] matrix2 = acceptMatrix();
        int[][] resultOfAddition = addMatrices(matrix1, matrix2);
        System.out.println("Result of Addition");
        printMatrix(resultOfAddition);
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] acceptMatrix() {
        System.out.println("Enter the matrix dimension");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter the matrix");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                matrix[r][c] = scanner.nextInt();
            }
        }
        printMatrix(matrix);
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
