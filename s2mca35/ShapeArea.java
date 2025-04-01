 import java.util.*;
class FindArea
{
	void display(int side)
	{
		int area=side*side;
		System.out.println("Area of square:"+area);
	}
	void display(int length,int breadth)
	{
		int area=length*breadth;
		System.out.println("Area of rectangle:"+area);
	}
	void display( float base,float height,boolean isTriangle)
	{
		float area=(base*height)/2;
		System.out.println("Area of triangle:"+area);
	}
}
	public class ShapeArea
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			FindArea obj=new FindArea();
			System.out.println("Enter the side of square:");
			int side=sc.nextInt();
			obj.display(side);
			System.out.println("Enter the length of rectangle:");
			int length=sc.nextInt();
			System.out.println("Enter the breadth of rectangle:");
			int breadth=sc.nextInt();
			obj.display(length,breadth);
			System.out.println("Enter the base of triangle:");
			float base=sc.nextFloat();
			System.out.println("Enter the height of triangle:");
			float height=sc.nextFloat();
			obj.display(base,height,true);
		}
	}
