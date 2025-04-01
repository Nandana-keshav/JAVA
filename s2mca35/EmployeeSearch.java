import java.util.*;
class Employee
{
	int eNo;
	String eName;
	double eSalary;
	Employee(int eNo,String eName,double eSalary)
	{
		this.eNo=eNo;
		this.eName=eName;
		this.eSalary=eSalary;
	}
	void display()
	{
		System.out.println("Employee Number:"+eNo);
		System.out.println("Employee Name:"+eName);
		System.out.println("Employee Salary:"+eSalary);
	}
}
public class EmployeeSearch
{
	public static void main(String args[])
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		int n=sc.nextInt();
		Employee[] employees=new Employee[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter details of employee:"+(i+1));
			System.out.println("Employee Number:");
			int eNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Employee Name:");
			String eName=sc.nextLine();
			System.out.println("Employee Salary:");
			double eSalary=sc.nextDouble();
			employees[i]=new Employee(eNo,eName,eSalary);
		}
		System.out.println("\nEnter employee number to search:");
		int searchEno=sc.nextInt();
		boolean found=false;
		for(Employee emp:employees)
		{
			if(emp.eNo==searchEno)
			{
				System.out.println("Employee Found");
				emp.display();
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Employee not found");
		}
	}
}
