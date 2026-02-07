package _02_Conditionals;
import java.util.Scanner;

public class _03_AbsolouteNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter a number :");
		n= sc.nextInt();
		if(n<0) n=-n;
		System.out.println("The absolute number is :"+n);
	}

}
