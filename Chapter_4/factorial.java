package Chapter_4;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factorial number: ");
		int j=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=j;i++)
		{
			fact*=i; //fact*i = fact
		}
		System.out.println("Factorial of GIven Number: " +fact);
	}

}