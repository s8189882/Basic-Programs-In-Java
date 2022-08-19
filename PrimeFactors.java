package basic.java.programs;

import java.util.Scanner;

/*Desc -> Computes the prime factorization of N using brute force.
 * I/P -> Number to find the prime factors
 * Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
 * O/P -> Print the prime factors of number N.
 */

public class PrimeFactors {
	
public static void main(String[] args) {
		
		int i = 0;
		int f = 0;
		int n = 0;
		int j = 0;
		int check = 0;
		
		System.out.println("Welcome to the Prime Factorization Program!");
		System.out.print("Enter the number whose prime factors are required : ");
	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println();
		System.out.println("Prime Factors of "+ n +" are : ");
		
		for (i = 2; i <= n/2; i++) 
		{
			if(n%i == 0)
			{
				f = i;
				for (j = 2; j <= f/2; j++) 
				{
					check = 0;
					if(f%j == 0) {
						check = 1;
						break;
					}
				}
				if (check == 0)
					System.out.print("  " + f);
			}
		}	
	}
}
