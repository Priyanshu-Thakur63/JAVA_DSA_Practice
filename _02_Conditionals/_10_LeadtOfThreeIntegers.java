package _02_Conditionals;
import java.util.Scanner;

public class _10_LeadtOfThreeIntegers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a= sc.nextInt();
		System.out.println("Enter number 2: ");
		int b= sc.nextInt();
		System.out.println("Enter number 3: ");
		int c= sc.nextInt();
		
		if(a<b && a<c) System.out.println("least :"+a);
		else if(b<c) System.out.println("Least :"+b);
		else System.out.println("Least :"+c);
		
	}

}
