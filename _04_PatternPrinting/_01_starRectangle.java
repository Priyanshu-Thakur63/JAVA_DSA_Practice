package _04_PatternPrinting;
import java.util.Scanner;

public class _01_starRectangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter rumber of rows & Coloumn :");
		int r= sc.nextInt();
		int c= sc.nextInt();
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
