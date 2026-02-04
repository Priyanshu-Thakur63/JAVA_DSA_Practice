package Github.JAVA_DSA_Practice.Basics;

import java.util.Scanner;

public class _10_checkingForAsciiNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character you want to know ASCII of: ");
        ch= sc.next().charAt(0);
        System.out.println("The ASCII Value of "+ch+" is :"+(int)ch);
    }
}
