package Lab11;

import java.util.Arrays;

public class Ex3_ArrayNegative {

	public static void main(String[] args) {
		
		int[] arr = {0,1,5,-4,7};
		
		int[] newArr = add(arr,2);
		
		System.out.println(Arrays.toString(newArr));

	}
	
	public static int[] add(int[] array, int key) {
		
		boolean foundNegative = false;

		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] < 0) {
				array[i] = key;
				foundNegative = true;
				break;
			}	
		}
		
		if (!foundNegative) {
				int[] newArr = {-1};
		        return newArr;
		}
		return array;
	}

}
