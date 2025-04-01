package graphics;
public class Triangle implements Figure
{
 	private double base,height;
 	public Triangle(double base,double height)
 	{
 		this.base=base;
 		this.height=base;
 	}
 	public double area()
 	{
 		return 0.5*base*height;
 	}
 }
