package _01_Basics;
import java.util.Scanner;
public class _06_remainder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		int remainder;
		System.out.println("Enter number 'a': ");
		a= sc.nextInt();
		System.out.println("Enter number 'b': ");
		b= sc.nextInt();
		remainder= a%b;
		System.out.println("The remainder for "+a+"%"+b+" is :"+remainder);
	}

}
