package Lab10;

import java.util.Arrays;

//Create a new array by reversing the first ‘n’ elements of the original array
//
public class Ex3_Array {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		
		int[] reversed = reverse(array, 5);
		
		System.out.println(Arrays.toString(reversed));
		
		int sum = 0;
		for(int i = 0; i < reversed.length; i ++) {
			sum += reversed[i];	
		}
		
		System.out.println("Sum: " + sum);
	
	}

	public static int[] reverse(int[] array, int n) {
		
		for (int i = 0; i < n / 2; i++) {
	        int temp = array[i];
	        array[i] = array[n - i - 1];
	        array[n - i - 1] = temp;
	    }
		
		return array;
	}
	
	
}
