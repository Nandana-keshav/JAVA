import java.util.*;
class result
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int []arr1=new int[n];
		int []arr2=new int[n];
		int []res=new int[n];
		System.out.println("Enter the elements of first array:");
		for(i=0;i<n;i++)
		{
			System.out.println("");
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array:");
		for(i=0;i<n;i++)
		{
			System.out.println("");
			arr2[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			res[i]=arr1[i]+arr2[i];
			System.out.println("Resultant array:"+res[i]);
		}
		System.out.println("odd/even:");
		for(i=0;i<n;i++)
		{
			if(res[i]%2==0)
			{
				System.out.println(res[i]+":the element is even");
			}
			else
			{
				System.out.println(res[i]+":the element is odd");
			}
		}
	}
}
