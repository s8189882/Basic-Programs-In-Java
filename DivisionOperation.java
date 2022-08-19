package basic.java.programs;

import java.util.Scanner;

// Java Program to Compute Quotient and Remainder

public class DivisionOperation {
	
	public static void main(String args[]) {

		int mod = 3;
		int quotient = 0;
		int divisor = 0;
		int dividend = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to perform Division Operation");
		System.out.print("Enter the Divisor : ");
		divisor = sc.nextInt();
		System.out.print("Enter the Dividend : ");
		dividend = sc.nextInt();
		
		quotient = (int)(dividend / divisor);
		mod = (int)(dividend % divisor);
		
		System.out.println();
		System.out.println(" Divisor : " + divisor + "     Dividend : " + dividend);
		System.out.println(" Quotient : " + quotient + "     Remainder : " + mod);
	}
}
