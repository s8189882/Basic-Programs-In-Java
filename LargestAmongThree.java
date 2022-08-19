package basic.java.programs;

import java.util.Scanner;

/* Java Program to Find the Largest Among Three Numbers
 * 
 */

public class LargestAmongThree {

	public static void main(String args[]) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		int large = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

	
		//large = a;
		if (large < a) {
			large = a;
			if (large < b) {
				large = b;
				if (large < c)
						large = c;
			}
		}
		
		System.out.println("");
		System.out.println(large + " is the largest number of all three.");
		
	}
}
