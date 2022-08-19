package basic.java.programs;

import java.util.Scanner;

// Java Program to Swap Two Numbers

public class SwapNumbers {
	
	public static void main(String args[]) {
		
		int a = 0;
		int b = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to be swapped");
		System.out.print("Enter the Number 1 : ");
		a = sc.nextInt();
		System.out.print("Enter the Number 2 : ");
		b = sc.nextInt();
	
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("");
		System.out.println("After swapping...");
		System.out.println("Number 1 : " + a);
		System.out.println("Number 2 : " + b);

	}

}
