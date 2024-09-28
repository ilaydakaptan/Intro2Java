package Lab15;

import java.util.Arrays;

public class Ex2_InstertionSort {
	
	public static void main(String[] args) {
		int[] arrayEx = {5,3,1,7,4,2};
		
		insertionSort(arrayEx);
		
		System.out.println(Arrays.toString(arrayEx));
	}
	
	public static int[] insertionSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {
			int key = array[i];
			int j;
			
			for(j = i -1; j>=0 && array[j] > key; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = key;
		}
		return array;
	}

}
