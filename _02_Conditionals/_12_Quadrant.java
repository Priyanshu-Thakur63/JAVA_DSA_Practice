package _02_Conditionals;
import java.util.Scanner;

public class _12_Quadrant {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double a,b;
		System.out.println("Enter cordinates a and b :");
		 a= sc.nextDouble();
		 b= sc.nextDouble();
		 if (a>0 && b>0) System.out.println("Quadrant : First");
		 else if (a<0 && b>0) System.out.println("Quadrant : Second");
		 else if (a<0 && b<0) System.out.println("Quadrant : Third");
		 else if (a>0 && b<0) System.out.println("Quadrant : Fourth");
		 else if(a==0 && b==0) System.out.println("Centre");
	}

}
