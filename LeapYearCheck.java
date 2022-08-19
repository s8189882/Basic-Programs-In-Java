package basic.java.programs;

import java.util.Scanner;

/* I/P -> Year, ensure it is a 4 digit number.
 * Logic -> Determine if it is a Leap Year.
 * O/P -> Print the year is a Leap Year or not.
 */

public class LeapYearCheck {

	public static void main(String[] args) {
		
		int year = 0;
		boolean check = false;
		
		System.out.println("Welcome to the Leap Year Program!");
		System.out.print("Enter a year to check whether it is a leap year or not : ");
	
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		System.out.println();
		if (year >= 1000 && year <= 9999) {
			if (year%4 == 0) {
				check = true;
				if(year%100 == 0 ) {
					if(year%400 == 0) 
						check = true;
					else
						check = false;
				}
			}
			if (check)
				System.out.println(year + " is a Leap Year.");
			else
				System.out.println(year + " is not a Leap Year.");
		}
		else {
			System.out.println("You did not enter a 4-digit year.");
			System.out.println("Kindly try again!");
		}
	}
}
