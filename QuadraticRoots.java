package basic.java.programs;

import java.util.Scanner;

/*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. 
 * Since the equation is x*x, hence there are 2 roots. 
 * The 2 roots of the equation can be found using a formula 
 * (Note: Take a, b and c as input values)
 * delta = b*b - 4*a*c
 * Root 1 of x = (-b + sqrt(delta))/(2*a) 
 * Root 2 of x = (-b - sqrt(delta))/(2*a)
 */

public class QuadraticRoots {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		double discriminant = 0;
		double root1 = 0;
		double root2 = 0;

		System.out.println("Welcome to the Quadratic Equation Program!");
		System.out.println("\nTo find the roots of the quadratic equation 'ax^2 + bx + c = 0' ");
		System.out.print("Enter the value of coefficient 'a' : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.print("Enter the value of coefficient 'b' : ");
		b = sc.nextInt();
		System.out.print("Enter the value of the constant 'c' : ");
		c = sc.nextInt();
		
		discriminant = Math.pow(b, 2) - (4*a*c);
		root1 = (Math.sqrt(discriminant) - b)/(2*a);
		root2 = (-Math.sqrt(discriminant) - b)/(2*a);
	

		System.out.print("\nRoots of the quadratic equation '"+a+"x^2 + "+b+"x + "+c+" = 0' are ");
		System.out.printf("%.2f and %.2f", root1, root2);
	}

}
