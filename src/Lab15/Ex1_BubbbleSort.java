package Lab15;

//Write Java methods which takes an integer array as a parameter and sorts the array implementing
//Assume that we have an array of [5,3,1,7,4,2]

public class Ex1_BubbbleSort {

	public static void main(String[] args) {
		int[] arrayEx = {5,3,1,7,4,2};
		
		bubbleSort(arrayEx);
		
		for(int i = 0; i < arrayEx.length; i++) {
			System.out.print(arrayEx[i] + " ");
		}
	}

	public static int[] bubbleSort(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;			
				}	
			}
		}
		return array;	
	}
	
}
