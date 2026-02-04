package Github.JAVA_DSA_Practice.Basics;

import java.util.Scanner;

public class _08_remainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        System.out.println("Enter number a and b: ");
        a= sc.nextInt();
        b=  sc.nextInt();
        System.out.println("The remainder of a and b is :"+(a%b));
    }
}
