package Github.JAVA_DSA_Practice.Basics;

import java.util.Scanner;

public class _05_areaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r, area;
        System.out.print("Enter radius: ");
        r= sc.nextDouble();
        area= 3.141*r*r;
        System.out.println("Area of the circle is: "+area);
    }

}
