import java.util.*;
import Graphics.*;

 class shape1 
 {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     Rectangle rect = new Rectangle(2,4);
     Triangle tri = new Triangle(3,5);
     Square sq = new  Square(4);
     Circle cir = new Circle(3);
     System.out.println("1.Rectangle 2.Triangle 3.Square 4.Circle");
     System.out.println("Enter the choice:");
     int choice = sc.nextInt();
     sc.nextLine();
     switch(choice)
     {
        case 1:
         System.out.println("Area of rec:"+rect.area());
         break;
        case 2:
          System.out.println("Area of triangle"+tri.area());
          break;
        case 3:
         System.out.println("Area of square:"+sq.area());
         break;  
        case 4:
         System.out.println("Area of circle:"+cir.area());
         break;
        case 5:
          System.out.println("Exiting");
          break;
        default:
           System.out.println("Invalid choice");
      }
    }
}
