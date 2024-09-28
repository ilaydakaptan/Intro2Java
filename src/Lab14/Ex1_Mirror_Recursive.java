package Lab14;

//Write a Java code including a recursive method named Mirror(int n) which takes an integer as a parameter
//a)The method will display the result of dividing the number by 2 until it reaches 1 in case n is positive and -1 for negative numbers
//b)Once it reaches 1 or -1 the method will display the reverse of part
import java.util.Scanner;

public class Ex1_Mirror_Recursive {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int n = input.nextInt();
		
		mirror(n);
	}
	
	public static void mirror(int num) {
		
		if(num ==1 || num==-1) {
			System.out.print(num);
		}
			
		else {
			System.out.print(num+",");
			mirror(num/2);
			System.out.print(","+num);
		}
		
	}
	
}
