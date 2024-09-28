package Lab11;

import java.util.Arrays;
public class Ex2_PerfectNum {

	public static void main(String[] args) {
		int[] arrayEx  = {5,6,28};
		
		boolean[] a = perfect(arrayEx);
		
		System.out.println(Arrays.toString(a));

	}
	
	public static boolean[] perfect(int[] array) {
		
		boolean[] boolArray = new boolean[array.length];
		
		for(int i = 0; i < array.length; i++) {
			
			int total =  0;
			
			for(int j = 1; j < array[i]; j++) {
				
				if (array[i] % j == 0 ) {
					total += j;
				}
			}
			
			if(total == array[i]) {
				boolArray[i] = true;
			}		
		}		
		return boolArray;	
	}
}
