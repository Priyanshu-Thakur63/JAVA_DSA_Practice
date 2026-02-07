package _01_Basics;
import java.util.Scanner;

public class _07_HalfTheNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		double half;
		System.out.print("Enter a number you want half of :");
		n= sc.nextInt();
		half= ((double)n)/2;
		System.out.println("The half of "+n+" is :"+half);
		
	}

}
