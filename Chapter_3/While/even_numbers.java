package While;
import java.util.Scanner;

public class even_numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to begin: ");
		int n=sc.nextInt();
		System.out.println("Enter the number to end: ");
		int end=sc.nextInt();
		while(n<=end)
		{
			System.out.println("Number: " +n);
			n+=2;
		}
	}

}
