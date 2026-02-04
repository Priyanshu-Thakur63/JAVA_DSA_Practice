package Github.JAVA_DSA_Practice.Basics;

import java.util.Scanner;

public class _07_simpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double si,p,r,t;
        System.out.print("Enter principal rate, rate off interest, and time period: ");
        p= sc.nextDouble();
        r= sc.nextDouble();
        t= sc.nextDouble();
        si= (p*r*t)/100;
        System.out.println("The Simple interest is: "+si);
    }
}
