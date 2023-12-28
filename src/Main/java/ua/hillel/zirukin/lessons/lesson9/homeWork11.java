package ua.hillel.zirukin.lessons.lesson9;
import java.util.Scanner;

public class homeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (M): ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int numCols = scanner.nextInt();

        int[][] originalMatrix = new int[numRows][numCols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                originalMatrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transposedMatrix = transposeMatrix(originalMatrix);

        System.out.println("\nOriginal matrix:");
        printMatrix(originalMatrix);

        System.out.println("\nTransposed matrix:");
        printMatrix(transposedMatrix);

        scanner.close();
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[][] transposedMatrix = new int[numCols][numRows];

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
