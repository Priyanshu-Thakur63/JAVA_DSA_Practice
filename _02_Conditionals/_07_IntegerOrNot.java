package _02_Conditionals;
import java.util.Scanner;

public class _07_IntegerOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a= sc.nextInt();
		if(a>=48 && a<=57) System.out.println("The number is a Integer");
		else System.out.println("The number is an Integer");
	}
}
