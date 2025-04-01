import java.util.*;
class product 
{
 	int pcode;
 	String pname;
 	float price;
 	
 	void getdata()
 	   { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pcode,pname,price");
		this.pcode=sc.nextInt();
		sc.nextLine();
		this.pname=sc.nextLine();
		this.price=sc.nextFloat();
	   }
}
class Product
{
     public static void main(String args[])
     {
	Scanner sc=new Scanner(System.in);
	product p1=new product();
	p1.getdata();
	product p2=new product();
	p2.getdata();
	product p3=new product();
	p3.getdata();
	if(p1.price<p2.price && p1.price<p3.price)
	{
		System.out.println("Cheapest is 1st product");
	}
	else if(p2.price<p3.price)
	{
		System.out.println("Cheapest is 2nd product");
	}
	else
	{
		System.out.println("Cheapest is 3rd product");
	}
    }
}
