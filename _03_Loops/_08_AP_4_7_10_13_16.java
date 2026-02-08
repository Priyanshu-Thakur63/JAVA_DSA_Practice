package _03_Loops;
import java.util.Scanner;

public class _08_AP_4_7_10_13_16 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		int a=4;
		for(int i=1; i<=n; i++){
			System.out.println(a);
			a+=3;
		}
	}

}
