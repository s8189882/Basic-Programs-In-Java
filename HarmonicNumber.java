package basic.java.programs;

import java.util.Scanner;

/*Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 * I/P -> The Harmonic Value N. Ensure N != 0
 * Logic->compute1/1+1/2+1/3+...+1/N
 * O/P -> Print the Nth Harmonic Value.
 */

public class HarmonicNumber {

public static void main(String[] args) {
		
		int i = 0;
		int n = 0;
		double harmonic = 0.0;
		
		System.out.println("Welcome to the nth Harmonic Number Generator Program!");
		System.out.print("Enter the 'n'th number : ");
	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if (n <= 0)
			System.out.println("\nEnter a positive number.\nPlease try again!");
		else {
			for(i=1; i <= n; i++) {
				harmonic += (1/(double)i);
				System.out.println(harmonic + "	");
			}
			System.out.println(n + "th Harmonic Value = " + String.format("%.2f", harmonic));
		}
	}
}
