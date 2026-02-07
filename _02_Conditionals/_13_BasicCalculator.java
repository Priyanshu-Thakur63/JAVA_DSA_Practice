package _02_Conditionals;
import java.util.Scanner;

public class _13_BasicCalculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two values :");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		System.out.println("Enter the operator from +, -, *, /, % :");
		char op= sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("a+b="+(a+b));
			break;
		case '-':
			System.out.println("a-b="+(a-b));
			break;
		case '*':
			System.out.println("a*b="+(a*b));
			break;
		case '/':
			System.out.println("a/b="+(a/b));
			break;
		case '%':
			System.out.println("a%b="+(a%b));
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
