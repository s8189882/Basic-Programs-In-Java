package basic.java.programs;

import java.util.Scanner;

/*Java Program to Check Whether a Number is Even or Odd
 * 
 */

public class EvenOrOdd {
	
	public static void main(String args[]) {

		int num = 0;
		int mod = 3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		mod = num%2;
		
		System.out.println();
		if (mod == 0)
			System.out.println(num + " is an EVEN number.");
		else
			if (mod == 1)
				System.out.println(num + " is an ODD number.");
		
	}
}
