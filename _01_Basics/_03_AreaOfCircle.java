package _01_Basics;
import java.util.Scanner;

public class _03_AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a,r;
		System.out.println("Enter radius: ");
		r= sc.nextInt();
		a= 3.141*r*r;
		System.out.println("Area of the circle is: "+a);
	}

}