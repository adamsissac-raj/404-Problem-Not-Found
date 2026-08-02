package Chapter_3;
import java.util.Scanner;

public class greatest_of_two_numbers 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of A: ");
		int a=sc.nextInt();
		System.out.println("Enetr the Value of B: ");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is Greater");
		}
		else
		{
			System.out.println("B is Greater");
		}

	}

}
