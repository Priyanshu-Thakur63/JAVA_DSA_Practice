package Github.JAVA_DSA_Practice.Conditionals;

import java.util.Scanner;

public class _03_absoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        if (a<0) a=-a;
        System.out.println("Absolute Number is : "+a);
    }
}
