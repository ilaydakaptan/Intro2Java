package Lab13;

//Given an integer n, return true if it is a power of two. Otherwise, return false. 
//An integer n is a power of two, if there exists an integer x such that n == 2^𝑥.
import java.util.Scanner;
import java.math.*;

public class Ex1_Powerof2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int n = input.nextInt();
		
		System.out.println(isPower2(n));
		
	}
	
	public static boolean isPower2(int num) {
		
		if(num < 0) {
			return false;
		}
		
		for(int x = 0; x < num; x++) {
			
			if(Math.pow(2, x) == num) {
				return true;
			}
		}
		return false;
	}
}
