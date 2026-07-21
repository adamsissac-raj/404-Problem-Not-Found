package Chapter_4;
import java.util.Scanner;

public class five_table 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table Number: ");
		int num=sc.nextInt();
		System.out.println("Enter the Number of Multiply: ");
		int j=sc.nextInt();
		for(int i=1;i<=j;i++)
		{
			System.out.println(num + " * " + i + " = " + (num*i));
		}

	}

}
