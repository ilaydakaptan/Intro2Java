package Lab14;

import java.util.Scanner;

public class Ex2_GoldenRatio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = input.nextInt();

		System.out.println("golden ratio is " + goldenRatio(number));
	}
	
	public static double goldenRatio(int num) {
		
		if(num < 0) {
			return 0;
		}else if(num == 0){
			return 1;
		}else {
			return 1 + 1 / goldenRatio(num -1);
		}
	}
}
