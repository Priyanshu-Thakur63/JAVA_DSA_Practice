package _04_PatternPrinting;

import java.util.Scanner;

public class _03_alphabetSquare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((char)(65+j-1)+ " ");
			}
			System.out.println();
		}
	}

}
