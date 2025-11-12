package advance_java1;

import java.util.*;

abstract class Shape{
	abstract void area();
}

class rectangle extends Shape{
	 void area() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length and height:");
		int l=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("the area of the rectangle: "+ (l*h));
	}
	
	
}

class circle extends Shape{
	void area() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radies: ");
		int r=sc.nextInt();
		System.out.println("the area of the rectangle: "+ (3.14*r*r));
	}
}
class triangle extends Shape{
	void area() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length and height:");
		int l=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("the area of the triangle: "+ (l*h)/2);
	}
}

public class area {
	
	void findarea(Shape a) {
		a.area();
	}

	public static void main(String[] args) {
		rectangle r=new rectangle();
		circle c=new circle();
		triangle t=new triangle();
		area a=new area();
		a.findarea(c);
		a.findarea(r);
		a.findarea(t);

	}

}
