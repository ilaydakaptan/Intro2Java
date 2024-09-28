package Lab13;

//EZBERLE

public class Ex4_Target {

	public static void main(String[] args) {
		
		 int[] array = {4, 2, 3, 0, 3, 1, 2};
	     int start = 5;
	     int target = 2;
	     
	     System.out.println("Hedefe Ulaşılabilir mi? " + findTarget(array, start, target));
	}
	
	public static boolean findTarget(int[] array, int start, int target){
		
		 if (start < 0 || start >= array.length || array[start] == -1) {
			 return false;
	     }

	     if (array[start] == target) {
	         return true;
	     }

	     int jump = array[start];
	     array[start] = -1; // Ziyaret edildi olarak işaretle
	     
	     return findTarget(array, start + jump, target) || findTarget(array, start - jump, target);
	}

}
