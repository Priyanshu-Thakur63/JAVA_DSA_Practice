package _04_PatternPrinting;

import java.util.Scanner;

public class _09_alternateTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2==0) {
					System.out.print((char)(65+j-1)+" ");
				}
				else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
