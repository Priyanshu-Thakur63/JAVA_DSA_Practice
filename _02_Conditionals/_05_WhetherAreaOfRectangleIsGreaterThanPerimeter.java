package _02_Conditionals;
import java.util.Scanner;

public class _05_WhetherAreaOfRectangleIsGreaterThanPerimeter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double len,br, per, area;
		System.out.println("Enter length and Breadth of teh Rectangle :");
		len= sc.nextDouble();
		br= sc.nextDouble();
		per= 2*(br+len);
		area= br*len;
		if(area>per) System.out.println("Area is greater than Perimeter:- Area: "+area+"    Perimeter: "+per);
		else if(area<per) System.out.println("Perimeter is greater than the Area:-   Area"+area+"     Perimeter"+per);
		else if(area==per) System.out.println("Perimeter and Area is same:-   Area:"+area+"      Perimeter :"+per);
				
	}

}
