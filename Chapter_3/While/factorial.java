package While;
import java.util.Scanner;

public class factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for Factorial: ");
		int n=sc.nextInt();
		int fact=1, i=1;
		while(i <= n)
		{
			fact*=i;
			i++;
		}
		System.out.println("Factorial of the Given Number: " + fact);
	}
}
