package basic.java.programs;

import java.util.Scanner;

/*Write a program Distance.java that takes two integer command-line arguments x and y 
 * and prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
 * The formulae to calculate distance = sqrt(x*x + y*y). 
 * Use Math.power function
 */

public class Distance {

	public static void main(String[] args) {
		
		int xCoordinate = 0;
		int yCoordinate = 0;
		double distance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Distance from Origin Program ");
		System.out.println("\nUsing the Cartesian Coordinate System, enter the point whose distance is to be calculated from the Origin");
		System.out.print("Enter the abscissa (x-coordinate) : ");
		xCoordinate = sc.nextInt();
		System.out.print("Enter the ordinate (y-coordinate) : ");
		yCoordinate = sc.nextInt();
		
		distance = Math.sqrt(Math.pow(xCoordinate, 2)+Math.pow(yCoordinate, 2));
		System.out.print("\nDistance of the point ("+xCoordinate+", "+yCoordinate+") from Origin is : ");
		System.out.printf("%.2f units", distance);
		
	}
}
