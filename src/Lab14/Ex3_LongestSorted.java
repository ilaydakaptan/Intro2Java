package Lab14;

public class Ex3_LongestSorted {

	public static void main(String[] args) {

		int[] arrayEx = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19};
		System.out.println("longest sorted array has " + longestSorted(arrayEx) + " numbers");
	}
	
	public static int longestSorted(int[] array) {
		int counter = 0;
		int max = 0;
		
		for(int i = 0; i < array.length-1; i++) {
			
			if(array[i] <= array[i+1]) {		
				counter += 1;
			}else {
				counter = 1;
			}	
			if (counter >= max) {
				max = counter;
			}
		}
		return max;
	}
}
