import java.util.*;
class multiply extends Thread 
{
	public void run()
		{
			int i;			
			System.out.println("Multiplication table of 5:");
			for(i=1;i<=50;i++)
			{
				System.out.println("5 x "+i+"="+(5*i));
			}
		}
}
class prime extends Thread
{	
	int n;
	prime(int n)
	{
		this.n=n;
	}
	
	public void run()
	{
		int k,j,flag=0;
		for(j=2;j<=n;j++)
			{
			flag=0;
			for(k=2;k<=j/2;k++)
				{
				if(j%k==0)
					{				
					flag=1;
					break;
					}
				}
			if(flag==0)
				System.out.println("Prime no: "+j);
			}
	}
}
class Threadpgm
{
	public static void main(String args[])
	{
		multiply mul=new multiply();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit");
		int n=sc.nextInt();
		prime  num=new prime(n);
		mul.start();
		num.start();
	}
}

