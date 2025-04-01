import java.util.*;
class Matrix
{
	public static void main(String args[])
	{
		int a,b,m,n,i,j,k;
		int [][]p=new int [5][5];
		int [][]q=new int [5][5];
		int [][]r=new int [5][5];
		int [][]mul=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in first matrix:");
		a=sc.nextInt();
		System.out.println("Enter the number of columns in first matrix:");
		b=sc.nextInt();
		System.out.println("Enter the number of rows in second matrix:");
		m=sc.nextInt();
		System.out.println("Enter the number of columns in second matrix:");
		n=sc.nextInt();
		if(a==m && b==n)
		{
			
			System.out.println("Enter the elements of first matrix:");
			for(i=0;i<a;i++)
			{
				for(j=0;j<b;j++)
				{
					p[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the elements of second matrix:");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					q[i][j]=sc.nextInt();
				}
			}
		    System.out.println("first matrix:");
		    for(i=0;i<a;i++)
		    {
			for(j=0;j<b;j++)
			{
				System.out.println(p[i][j]+"");	
			}		
			System.out.println("");
		}
		System.out.println("second matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(q[i][j]+"");
			}
			System.out.println("");
		}
		for(i=0;i<a;i++)
		{
			for(j=0;j<n;j++)
			{	
				for(k=0;k<b;k++)
				{
					r[i][j]=p[i][j]+q[i][j];
				}
			}
		}
		System.out.println("Matrix addition:");
		for(i=0;i<a;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(r[i][j]+"");
			}
			System.out.println("");
		}
       	      }  
	      else
	      {
		System.out.println("Matrix cannot be added");
	      }
	     if(b==m)
	     {
	          
	     	
	     	System.out.println("Performing matrix multiplication");
	     	for(i=0;i<a;i++)
	     	{	
	     		for(j=0;j<n;j++)
	     		{          
	     		          mul[i][j]=0;
	     			for(k=0;k<b;k++)
	     			{
	     				mul[i][j]+=p[i][k]*q[k][j];
	     			}
	     			
	     		}
	     	}
	     	System.out.println("Matrix Multiplication");
	     	for(i=0;i<a;i++)
	     	{
	     		for(j=0;j<n;j++)
	     		{
	     			System.out.println(mul[i][j]+"");
	     		}
	     		System.out.println("");
	     	}
	     }
	     else
	     {
	     	System.out.println("Matrix cannot be multiplied");
	     }
	  }
}

					
			
