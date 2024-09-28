package Lab12;

//Write java program to calculate the sum of elements in each row and each column of the given matrix.
import java.util.Arrays;
public class Ex2_MatrixSum {

	public static void main(String[] args) {  
 
        int matrixEx[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
        					};    
        
        int[][] newMatrix = matrixSum(matrixEx);
        
        int[] rowSum = newMatrix[0];
        int[] columnSum = newMatrix[1];
        
        System.out.println("row sum: " +Arrays.toString(rowSum));
        System.out.println("column sum: " +Arrays.toString(columnSum));
	}

	public static int[][] matrixSum(int[][] matrix){
		
		int rowNum = matrix.length;
		int columnNum = matrix[0].length;
		
		int[][] newMatrix = new int[2][Math.max(rowNum,columnNum)];
		
		//row sum
		for(int i = 0; i < rowNum; i++) {
			
			int rowSum = 0; 
			for(int j = 0; j < columnNum; j++) {
				rowSum += matrix[i][j];
			}	
			newMatrix[0][i] = rowSum;
		}
		
		//column sum
		for(int j = 0; j < columnNum; j++) {
			
			int columnSum = 0;
			for(int i = 0; i < rowNum; i++) {
				columnSum += matrix[i][j];
			}
			newMatrix[1][j] = columnSum;
		}
		
		return newMatrix;
	}
	
}
