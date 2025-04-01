import java.util.*;
class Menudriven
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings in array:");
		int n=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[n];
		System.out.println("Enter"+n+"string");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		while(true)
		{
			int choice;
			System.out.println("Menu:\n1.Search\n2.Sort\n3.Display\n4.Exit\n");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
				System.out.println("Enter the string to search:");
				String target=sc.nextLine();
				boolean found=false;
				for(i=0; i<arr.length; i++)
				{
					if(arr[i].equalsIgnoreCase(target))
					{
						System.out.println("String fount at index:"+(i+1));
						found=true;
						break;
					}
				}
				if(!found)
				{
					System.out.println("String is not found");
				}
				break;
				case 2:
				Arrays.sort(arr);
				System.out.println("Sorted array is:"+Arrays.toString(arr));
				break;
				case 3:
				System.out.println("The array elements:");
				for(i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
				break;
				case 4:
				System.out.println("Exiting...");
				break;
				default:
				System.out.println("Invalid");
			}
		}
	}
}
