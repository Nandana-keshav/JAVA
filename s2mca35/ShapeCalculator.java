import java.util.*;
interface shape
{
  double area();
  double perimeter();
 }
 class circle implements shape
 {
   private double radius;
   circle(double radius)
   {
     this.radius=radius;
   }
   public double area()
   { 
      double a=Math.PI*radius*radius;
      return a;
   }
   public double perimeter()
   {
      double p=2*Math.PI*radius;
      return p;
   }
 }
 
 class Rectangle implements shape
 {
   private double length,width;
   Rectangle(double length,double width)
   {
      this.length=length;
      this.width=width;
   }
   public double area()
   {
     return length*width; 
   }
   public double perimeter()
   {
     return 2*(length+width);
   }
 }
 class ShapeCalculator
   {
     public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
       int choice=0;
       while(choice!=3)
       {
         System.out.println("Menu\n1.Calculate for circle\n 2.Calculate for rectangle\n 3.Exit\n");
         System.out.println("Enter your choice:");
         choice=sc.nextInt();
         switch(choice)
         {
           case 1:
              System.out.println("\nCalculate area and perimeter of circle:");
              System.out.println("\nEnter the radius of circle:");
              double radius=sc.nextDouble();
              circle Circle=new circle(radius);
              System.out.println("The area of circle is:"+Circle.area());
              System.out.println("The perimeter of circle is:"+Circle.perimeter());
              break;
           case 2:
              System.out.println("\nCalculate area and perimeter of rectangle:");
              System.out.println("\nEnter the length of rectangle:");
              double length=sc.nextDouble();
              System.out.println("\nEnter the breadth of rectangle:");
              double breadth=sc.nextDouble();
              Rectangle rectangle = new Rectangle(length,breadth);
              System.out.println("The area of rectangle is:"+rectangle.area());              
              System.out.println("The perimeter of rectangle is:"+rectangle.perimeter());
              break;
           case 3:
              System.out.println("\n Exiting the program");
              break;
              default:
                System.out.println("\nInvalid choice!");
          }
        }
      }
}
                
