package Lab12;

//Write java code that find the third largest and second smallest number in an array.

public class Ex1_Array {

	public static void main(String[] args) {
		
		int[] exArray = {12,8,3,1,10};
		
		int[] sorted = sortArray(exArray);
		
		int thirdLargest = sorted[sorted.length - 3];
		int secondSmallest = sorted[1];
		
		System.out.println("Third largest of array " + thirdLargest);
		System.out.println("Second smallest of array " + secondSmallest);
		
	}
	
	public static int[] sortArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				
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
