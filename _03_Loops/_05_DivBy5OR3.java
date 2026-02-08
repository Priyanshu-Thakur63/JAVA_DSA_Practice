package _03_Loops;
import java.util.Scanner;

public class _05_DivBy5OR3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		System.out.println("All the number from "+1+" to "+n+" that are divisible by 3 or 5 are :");
		for(int i= 1; i<=n; i++) {
			if(i%3==0 || i%5==0) System.out.println(i);
		}
	}

}
