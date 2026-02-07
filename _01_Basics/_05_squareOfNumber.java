package _01_Basics;
import java.util.Scanner;
public class _05_squareOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter a number:");
		n= sc.nextInt();
		int sqr= n*n;
		System.out.println("The square of "+n+" is :"+sqr);
	}

}
