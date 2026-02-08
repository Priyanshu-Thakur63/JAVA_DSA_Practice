package _03_Loops;
import java.util.Scanner;

public class _10_GP_3_12_48 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		int a=3;
		for(int i=1; i<=n; i++) {
			System.out.println(a);
			a*=4;
		}
	}

}
