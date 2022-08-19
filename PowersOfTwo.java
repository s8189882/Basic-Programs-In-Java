package basic.java.programs;

import java.util.Scanner;

/*Desc -> This program takes a command-line argument N and 
 * prints a table of the powers of 2 that are less than or equal to 2^N.
 * I/P -> The Power Value N. 
 * Only works if 0 <= N < 31 since 2^31 overflows an int
 * Logic -> repeat until i equals N.
 * O/P -> Print the year is a Leap Year or not.
 */

public class PowersOfTwo {
	
public static void main(String[] args) {
		
		int exponent = 0;
		int i = 0;
		
		System.out.println("Welcome to the Power of 2 Program");
		System.out.print("Enter the value of the Exponent : ");
	
		Scanner sc = new Scanner(System.in);
		exponent = sc.nextInt();
		
		if (exponent >= 0) {
			if (exponent < 31) {
				System.out.println("\nDisplaying Powers of 2...\n");
				for (i=0; i <= exponent; i++) 
					System.out.println("2^"+ i +" = "+ (int)(Math.pow(2, i)));
			}
			else
				System.out.println("\nInteger overflow error.\nKindly enter an exponential value less than 31. \nPlease try again!");		
		}
		else
			System.out.println("\nEnter a positive exponent value. \nPlease try again!");
	}
}
