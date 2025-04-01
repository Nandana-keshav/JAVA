import java.util.*;
interface Shape
{
	void area();
	void perimeter();
}
class circle implements Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public void area()
	{
		double result=3.14*radius*radius;
		System.out.println("Area of circle:"+result);
	}
	public void perimeter()
	{
		double result=2*3.14*radius;
		System.out.println("Perimeter of circle:"+result);
	}
}
class rectangle implements Shape
{
	double length,breadth;
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
		double result=length*breadth;
		System.out.println("Area of rectangle:"+result);
	}
	public void perimeter()
	{
		double result=2*(length+breadth);
		System.out.println("Perimeter of rectangle:"+result);
	}
}
public 
