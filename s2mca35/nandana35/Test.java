import graphics.*;
import java.util.*;
public class Test
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lrngth and breadth of rectangle:");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		Rectangle rect=new Rectangle(length,breadth);
		System.out.println("Area of rectangle:"+arect.area());
		
		System.out.println("Enter the side of square:");
		double side=sc.nextDouble();
		Square sq=new Square(side);
		System.out.println("Area of square:"+sq.area());
		
		System.out.println("Enter the base and heigth of triangle:");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		Triangle tri=new Triangle(base,heigth);
		System.out.println("Area of triangle:"+tri.area());
		
		System.out.println("Enter the side of circle:");
		double radius=sc.nextDouble();
		Circle circ=new Circle(radius);
		System.out.println("Area of circle:"+circ.area());
	}
}
		
		
		
