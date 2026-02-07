package _01_Basics;
import java.util.Scanner;

public class _04_SimpleInterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double p,r,t,si;
		System.out.println("Enter Priciple rate, rate of interest, time: ");
		p= sc.nextDouble();
		r= sc.nextDouble();
		t= sc.nextDouble();
		si= (p*r*t)/100.0;
		System.out.println("Simple Interest is: "+si);
	}

}	
