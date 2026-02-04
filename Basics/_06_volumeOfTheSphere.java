package Github.JAVA_DSA_Practice.Basics;

import java.util.Scanner;

public class _06_volumeOfTheSphere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r, volume;
        System.out.print("Enter the radius of circle: ");
        r= sc.nextDouble();
        volume= ((float)4/3)*3.141*r*r*r;
        System.out.println("The volume of the sphere is: "+volume);
    }
}
