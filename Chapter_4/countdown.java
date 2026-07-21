package Chapter_4;
import java.util.Scanner;

public class countdown 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Begin Countdown: ");
		int num=sc.nextInt();
		for (int i=num;i>0;i--)
		{
			System.out.println(+i);
		}
		System.out.println("End of Countdown");
	}

}
