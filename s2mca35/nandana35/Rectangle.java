package graphics;
public class Rectanle implements Figure
{
 	private double length,breadth;
 	public Rectangle(double length,double breadth)
 	{
 		this.length=length;
 		this.breadth=breadth;
 	}
 	public double area()
 	{
 		return length*breadth;
 	}
 }
