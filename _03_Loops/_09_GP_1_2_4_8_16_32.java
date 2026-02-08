package _03_Loops;
import java.util.Scanner;

public class _09_GP_1_2_4_8_16_32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		int a=1;
		for(int i=1; i<=n; i++) {
			System.out.println(a);
			a*=2;
		}
	}

}
