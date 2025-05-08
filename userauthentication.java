import java.util.*;
class Authentication extends Exception
{
  	public Authentication(String Message)
  		{
    			super(Message);
  		}
}
class userauthentication
{
	public static void authenticate(String username,String password)throws Authentication
   		{
     			String validuser="username";
    			String validpass="javapgm123";
     			if(username.isEmpty()||password.isEmpty())
     				{
       					throw new Authentication("username or password is empty here");
    				}
   			if(username.length()<5||password.length()<8)
     				{
       					throw new Authentication("Username must be atleast 5 charecters and password must be 8 charecters");
     				}
     			if(!username.equals(validuser))
     				{
       					throw new Authentication("Invalid username given");
     				}
     			if(!password.equals(validpass))
     				{
       					throw new Authentication("Invalid password given");
     				}
       			System.out.println("Authentication succesfull");
     		}
public static void main(String args[])
  {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter username:");
    	String Username=sc.nextLine();
    	System.out.println("Enter password:");
    	String password= sc.nextLine();
    	try
    		{
      			authenticate(Username,password);
    		}
    	catch(Authentication a)
    		{
      			System.out.println("Authentication failed"+a.getMessage());
    		}
   }
 }
      
      

