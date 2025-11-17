package Kindrick;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println();

        matrix[2][2] = 25;  // Modify one element

        System.out.println("Modified element at the third row and third column:");
        printMatrix(matrix);

        // Add a new row
        int[] newRow = {10, 11, 12};
        matrix = addRow(matrix, newRow);

        System.out.println("\nAfter adding a new row:");
        printMatrix(matrix);

        // Delete a column
        matrix = deleteColumn(matrix, 1); // delete 2nd column (index 1)

        System.out.println("\nAfter deleting column 2:");
        printMatrix(matrix);
    }

    // Print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Add a new row to the matrix
    public static int[][] addRow(int[][] matrix, int[] newRow) {
        int[][] newMatrix = new int[matrix.length + 1][newRow.length];
        System.arraycopy(matrix, 0, newMatrix, 0, matrix.length);
        newMatrix[matrix.length] = newRow;
        return newMatrix;
    }

    // Delete a column from the matrix
    public static int[][] deleteColumn(int[][] matrix, int columnToDelete) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length - 1];
        for (int i = 0; i < matrix.length; i++) {
            int newColIndex = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (j != columnToDelete) {
                    newMatrix[i][newColIndex++] = matrix[i][j];
                }
            }
        }
        return newMatrix;
    }
}
