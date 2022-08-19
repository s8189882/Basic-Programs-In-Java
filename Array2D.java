package basic.java.programs;

import java.io.PrintWriter;
import java.util.Scanner;

/*Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input 
 * and printing them out to standard output.
 * I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class 
 * Logic -> create 2 dimensional array in memory to read in M rows and N cols
 * O/P -> Print function to print 2 Dimensional Array. 
 * In Java use PrintWriter withOutputStreamWriter to print the output to the screen
 */

public class Array2D {
	
	public static void main(String[] args) {
		
		int rows = 0;
		int columns = 0;
		int array[][] = null;
		
		System.out.println("Welcome to 2D Array Program!");
		System.out.print("\nEnter the number of rows in your array : ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		System.out.print("Enter the number of columns in your array : ");
		columns = sc.nextInt();
		
		array = new int[rows][columns];
		
		System.out.println("\nEnter the elements of the Array");
		for (int i = 0; i<rows; i++)
			for(int j=0; j<columns;j++)
			{
				System.out.print("Enter the element in row "+(i+1)+" and column "+(j+1)+" : ");
				array[i][j] = sc.nextInt();
			}
		
		try {
			PrintWriter output = new PrintWriter(System.out);
			output.printf("\nYou enetered the following array : \n");
			for (int i = 0; i<rows; i++) {
				for(int j=0; j<columns;j++)
				{
					output.printf("	%d", array[i][j]);
					
				}
				output.printf("\n");
			}
		     output.close();
		}
		catch(Exception e) {
		      e.getStackTrace();
		 }
	}

}
