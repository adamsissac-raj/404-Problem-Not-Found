package Chapter_3;
import java.util.Scanner;

public class pass_or_fail 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark obtained: ");
		float mark=sc.nextFloat();
		if(mark >=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
