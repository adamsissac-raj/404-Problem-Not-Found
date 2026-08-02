package Chapter_3;
import java.util.Scanner;

public class password 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password: ");
		String pass=sc.nextLine();
		System.out.println("Confirm the Password: ");
		String pass2=sc.nextLine();
		if(pass.equals (pass) && pass2.equals (pass2))
		{
			System.out.println("Entered Password is Correct");
		}
		else
		{
			System.out.println("Entered Password is Incorrect");
		}		

	}

}
