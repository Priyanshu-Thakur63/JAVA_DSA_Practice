package _02_Conditionals;
import java.util.Scanner;

public class _04_ProfitLoss {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double sp, cp;
		System.out.println("Enter Selling price and Cost price :");
		sp= sc.nextDouble();
		cp= sc.nextDouble();
		if(sp>cp) System.out.println("Profit");
		else if(sp<cp) System.out.println("Loss");
		else if(sp==cp) System.out.println("No loss, NO profit");
	}

}
