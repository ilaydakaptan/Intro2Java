package Lab13;

import java.util.Scanner;

public class Ex2_Pow {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter 2 integers:");
		int x = input.nextInt();
		int n = input.nextInt();
		
		System.out.println(pow(x,n));

	}
	
	public static int pow(int num1, int num2) {
		
		int newNum2 = 1;
		for(int i = 1; i <= num1; i++) {
			newNum2 = num2 * newNum2;
		}
		
		return newNum2;
	}

	/*	RECURSIVE VERSION
	public static int pow(int num1, int num2) {
	    if (num1 == 0) {
	        return 1;
	    } else {
	        return num2 * pow(num1 - 1, num2);
	    }
	}*/

}
