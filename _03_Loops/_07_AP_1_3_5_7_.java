package _03_Loops;
import java.util.Scanner;

public class _07_AP_1_3_5_7_ {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		for(int i=1; i<=n;i++) {
			System.out.println((2*i-1));
		}
	}

}
