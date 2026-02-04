package Github.JAVA_DSA_Practice.Conditionals;

import java.util.Scanner;

public class _02_divBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a= sc.nextInt();
        if(a%5==0) System.out.println("Div by 5");
        else System.out.println("Not div by 5");
    }
}
