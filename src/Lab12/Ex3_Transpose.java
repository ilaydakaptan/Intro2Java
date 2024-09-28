package Lab12;

import java.util.Arrays;
public class Ex3_Transpose {

	public static void main(String[] args) {

        int matrixEx[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
        					};    

        int[][] transposed = transpose(matrixEx);
        // Print the transposed matrix
        for (int[] row : transposed) {
            System.out.println(Arrays.toString(row));
        }
	}
	
	public static int[][] transpose(int[][] matrix){
		
		int rowNum = matrix.length;
		int columnNum = matrix[0].length;
		
		int[][] transposeM = new int[columnNum][rowNum];
		
		for(int i = 0; i < columnNum; i++) {
			for(int j = 0; j < rowNum; j++) {
				
				transposeM [i][j] = matrix[j][i];
			}
		}
		return transposeM;
	}
}
