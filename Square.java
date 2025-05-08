package Graphics;
import java.util.*;
interface shape
{
 	double area();
 }
public class Square implements shape
{
	int side;
	public Square(int side)
	{
		this.side=side;
	}
	public double area()
	{
		return side*side;
	}
}

