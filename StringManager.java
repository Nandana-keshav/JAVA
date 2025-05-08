import java.util.*;
public class StringManager
{
	public static void main(String args[])
	{
		ArrayList<String> st=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		st.add("Apple");
		st.add("Pinapple");
		st.add("Orange");
		System.out.println("Initial List:"+st);
		System.out.println("Enter string to add:");
		String input=sc.nextLine();
		st.add(input);
		System.out.println("List after adding the string:"+st);
		st.remove("Pinapple");
		System.out.println("List after removing 'Pinapple':"+st);
		Collections.sort(st);
		System.out.println("Sorted list:"+st);
		System.out.println("Enter string to search:");
		String search=sc.nextLine();
		if(st.contains(search))
		{
			System.out.println(search+"is found");
		}
		else
		{
			System.out.println(search+"is not found");
		}
		System.out.println("Total number of elements is:"+st.size());
	}
}
