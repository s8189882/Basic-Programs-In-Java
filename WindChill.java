package basic.java.programs;

import java.util.Scanner;

/*Write a program WindChill.java that takes two double command-line arguments t and v 
 * and prints the wind chill. 
 * Use Math.pow(a, b) to compute ab. 
 * Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), t
 * he National Weather Service defines the effective temperature (the wind chill) to be:
 * Note: the formula is not valid if t is larger than 50 in absolute value or 
 * if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).
 */

public class WindChill {
	
	public static void main(String[] args) {
		
		double windChill = 0;
		int windSpeed = 0;
		int temperature = 0;
		
		System.out.println("Welcome to the Wind Chill Computation Program!");
		System.out.println("\nIn order to calculate the Wind Chill ");
		System.out.print("Enter the Wind Speed (miles/hour) : ");
		Scanner sc = new Scanner(System.in);
		windSpeed = sc.nextInt();
		System.out.print("Enter the Temperature (Fahrenheit) : ");
		temperature = sc.nextInt();
		
		if (temperature > -50 && temperature <= 50)
			if (windSpeed > 3 && windSpeed < 110) {
				windChill = 35.74 + (0.6215*temperature)+ ((0.4275*temperature)-35.75) * Math.pow(windSpeed, 0.16);
				System.out.println("\nBased on the given input, the current Wind Chill is "+ String.format("%.1f", windChill) +" Fahrenheit");
			}
				else {
				System.out.println("\nWind Chill is defined for Wind Speeds between 3 miles/hour and 110 miles/hour.");
				System.out.println("Kindly input the appropriate speed and try again.");
			}
		else {
			System.out.println("\nWind Chill is defined for temperatures below 50 Fahrenheit.");
			System.out.println("Kindly input a temperature between -50 Fahrenheit and 50 Fahrenheit and try again.");
		}
	}

}
