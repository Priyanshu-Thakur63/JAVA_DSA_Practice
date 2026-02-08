package _03_Loops;
import java.util.Scanner;

public class _11_CompositeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		int a=0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				a=1;
				break;
			}
		}
		if(a==1) System.out.println("Number is Composite");
		else System.out.println("Number is not Composite");
	}

}
