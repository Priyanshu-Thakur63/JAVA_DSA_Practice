package _02_Conditionals;
import java.util.Scanner;

public class _02_DivisibleBy5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter a number :");
		n= sc.nextInt();
		if(n%5==0) System.out.println("The above number is divisible by 5 :");
		else System.out.println("The above number is not divisible by 5");
		
	}

}
