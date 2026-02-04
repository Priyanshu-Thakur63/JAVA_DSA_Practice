package Github.JAVA_DSA_Practice.Conditionals;

import java.util.Scanner;

public class _01_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number: ");
        a= sc.nextInt();
        if(a%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
