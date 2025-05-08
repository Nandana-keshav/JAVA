import studentinfo.student;
import java.util.*;
public class Test
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student rollno:");
	int rollno=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter student name:");
	String nama<e=sc.nextLine();
	System.out.println("Enter marks obtained:");
	double mark=sc.nextDouble();
	student st=new student();
	st.set(rollno,name,mark);
	st.get();
}
}
