package _04_PatternPrinting;

import java.util.Scanner;

public class _15_starPlus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		if(n%2==0) {
			System.out.println("Wrong Input, Try odd numbers");
		}
		else {
			int mid=n/2;
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(j==mid+1 || i==mid+1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			
		}
	}

}

// Output
//1 2 3 4 5 
//    *      1   
//    *      2
//* * * * *  3
//    *      4
//    *      5