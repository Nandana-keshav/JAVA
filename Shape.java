package Graphics;
import java.util.*;

interface shape
{
	double area();

}
public class Rectangle implements shape
{
	private int length,breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double area()
	{
		return length*breadth;
	}
}
public class Triangle implements shape
{
	private int base,height;
	Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	public double area()
	{
		return 0.5*base*height;
	}
}
public class Square implements shape
{
	private int side;
	Square(int side)
	{
		this.side=side;
	}
	public double area()
	{
		return side*side;
	}
}
public class Circle implements shape
{
	private int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		double a=Math.PI*radius*radius;
		return a;
	}
}

publicS
  
      
