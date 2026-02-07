package _02_Conditionals;
import java.util.Scanner;

public class _11_grade {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your percentage :");
		double per= sc.nextInt();
		// For 80, 60, 40
		if(per>90) System.out.println("Grade: A+");
		else if(per>80) System.out.println("Grade: A");
		else if(per>70) System.out.println("Grade: B+");
		else if(per>60) System.out.println("Grade: B");
		else if(per>50) System.out.println("Grade: C+");
		else if(per>40) System.out.println("Grade: C");
		else System.out.println("Grade: Fail");
	}

}
