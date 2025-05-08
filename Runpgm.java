import java.util.*;
class Fibonacci implements Runnable
{
	public void run()
	{
		int i,num1=0,num2=1;
		System.out.println("Fibonacci series:");
		for(i=0;i<10;i++)
		{
			System.out.println(num1+" ");
			int nextnum=num1+num2;
			num1=num2;
			num2=nextnum;
		}
	}
}class Evennumber implements Runnable
{
	public void run()
	{
		int j;
		System.out.println("Even numbers between 1 to 20 are:");
		for(j=1;j<20;j++)
		{
			if(j%2==0)
			{
				System.out.println(j+" ");
			}
		}
	}
}
public class Runpgm
{
	public static void main(String args[])
	{
		Fibonacci fib=new Fibonacci();
		Evennumber even=new Evennumber();
		Thread tfib=new Thread(fib);
		Thread teven=new Thread(even);
		tfib.start();
		teven.start();
	}
}                         
