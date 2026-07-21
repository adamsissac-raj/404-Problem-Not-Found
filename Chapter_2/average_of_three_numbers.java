package Chapter_2;
import java.util.Scanner;

public class average_of_three_numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter value of A: ");
		int a=sc.nextInt();
		System.out.print("Enter value of B: ");
		int b=sc.nextInt();
		System.out.print("Enter value of C: ");
		int c=sc.nextInt();
		int average= (a+b+c)/3;
		System.out.println("The average is: " +average);
	}

}
