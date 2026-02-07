package _02_Conditionals;
import java.util.Scanner;

public class _06_CheckForThreeDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check for three digit :");
		int n= sc.nextInt();
		if(n>99 && n<1000) System.out.println("The number is an three digit");
		else System.out.println("The number is not an three digit number");
	}

}
