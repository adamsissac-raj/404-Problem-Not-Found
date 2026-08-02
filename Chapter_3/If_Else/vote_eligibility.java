package Chapter_3;
import java.util.Scanner;

public class vote_eligibility 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age you want to verify: ");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			System.out.println("Not Eligible to Vote");
		}
	}
}
