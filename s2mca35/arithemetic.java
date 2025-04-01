import java.util.*;
class mathematic
{
	public static void main(String args[])
	{
		int a,b,sum=0,diff=0,pro=0,div=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		diff=a-b;
		pro=a*b;
		div=a/b;
		System.out.println("sum"+sum);
		System.out.println("difference"+diff);
		System.out.println("product"+pro);
		System.out.println("division"+div);
	}
}
