package Kindrick;

public class MatrixMultiplication {
		public static void main(String[] args) {
			
	int[][] matrixA = {
			{1, 2, 3},
			{4, 5, 6}
	};
	
	int[][] matrixB = {
			{7, 8},
			{9, 10},
			{11, 12}
	};
	
	int[][] result = multiplyMatrices(matrixA, matrixB);
	System.out.println("Result of Matrix Multiplication");
	printMatrix(result);
		
	
		}
		
	public static int[][] multiplyMatrices(int[][] A, int[][] B) {
		int rowsA = A.length;
		int colsA = A[0].length;
		int rowsB = B.length;
		int colsB = B[0].length;
		
		if(colsA != rowsB) {
			throw new IllegalArgumentException("invalid matrix dimensions for multiplication");
		}
	
	
	}
	
		
		}
		
}
