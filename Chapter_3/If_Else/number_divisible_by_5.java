package Chapter_3;
import java.util.Scanner;
public class number_divisible_by_5 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(num %5 == 0)
		{
			System.out.println("It is divisible by 5");
		}
		else
		{
			System.out.println("Not divisible by 5");
		}
	}

}
