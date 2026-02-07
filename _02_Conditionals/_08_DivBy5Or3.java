package _02_Conditionals;
import java.util.Scanner;

public class _08_DivBy5Or3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter a number :");
		n=sc.nextInt();
		if(n%3==0 || n%5==0) System.out.println("Divisible by 5 or 3");
		else System.out.println("Not divisible by 5 or 3");
	}

}
