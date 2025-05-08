package Graphics;
import java.util.*;
interface shape
{
	double area();
}
public class Circle implements shape
{
	int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		double a=Math.PI*radius*radius;
		return a;
	}
}
