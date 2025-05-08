package Graphics;
import java.util.*;
interface shape
{
	double area();
}
public class Triangle implements shape
{
	int base,height;
	public Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	public double area()
	{
		return 0.5*base*height;
	}
}
  
