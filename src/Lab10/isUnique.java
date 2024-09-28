package Lab10;

public class isUnique {

	public static void main(String[] args) {
		

	}
	
	public static int[] unique(int[] array) {
		int[] uniqueArray = new int[array.length];
		
		int uniqueCounter = 0;
		int currentNum = 0;
		
		for(int i = 0; i < array.length; i++) {
			currentNum = array[i];
			boolean isUnique = true;
			
			for(int j = 0; j < uniqueCounter; j++) {
				
				if(uniqueArray[j] == currentNum) {
					isUnique = false;
					break;
				}		
			}
			if (isUnique) {
				uniqueArray[uniqueCounter] = currentNum;
				uniqueCounter ++;
			}
		}
		return uniqueArray;
	}
	

}
