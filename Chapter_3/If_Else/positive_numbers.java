package Chapter_3;
import java.util.Scanner;

public class positive_numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Number: ");
		int number=sc.nextInt();
		if(number >= 0)
		{
			System.out.println("The Entered number is Positive");
		}
		else
		{
			System.out.println("The Entered number is Negative");
		}
	}

}
