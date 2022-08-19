package basic.java.programs;

import java.util.Scanner;

/*I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
 * Logic -> Use Random Function to get value between 0 and 1. 
 * If < 0.5 then tails or heads
 * O/P -> Percentage of Head vs Tails
 */

public class FlipCoinPercentage {
	
	public static void main(String[] args) {
		
		int heads = 0;
		int tails = 0;
		double percentHeads = 0;
		double percentTails = 0;
		int n = 0;
		int i = 0;
		double flip = 0;
		
		System.out.println("Welcome to the Flip Coin Program!");
		System.out.println("This program prints the likehood of the occurence of Heads vs Tails.");
		System.out.print("\nEnter the number of flips of your choice : ");
	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if (n <= 0)
			System.out.println("\nEnter a positive number.\nPlease try again!");
		else {
			
			for(i=0; i < n; i++) {

				flip = Math.random();
				if (flip < 0.5) {
					tails++;
					System.out.print("\nTAILS	");
				}
				else {
					heads++;
					System.out.print("\nHEADS	");
				}
				System.out.print(flip);
			}
			System.out.println();
			System.out.println("\nHEADS "+heads+" times.");
			System.out.println("TAILS "+tails+" times.");
			percentHeads = (heads*100)/n;
			percentTails = (tails*100)/n;
			System.out.println("\nLikelihood of occurence of HEADS : " + percentHeads + "%" );
			System.out.println("\nLikelihood of occurence of TAILS : " + percentTails + "%" );
		}
	
	}

}
