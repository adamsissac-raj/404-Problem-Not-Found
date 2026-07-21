package Chapter_4;

import java.util.Scanner;

public class square_numbers 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Number: ");
		int num=sc.nextInt();
		System.out.println("Enter the End Number: ");
		int j=sc.nextInt();
		for(int i=1;i<=j;i++)
		{
			System.out.println(num + " ^ " + 2 + " = " + (i*num));
			num++;
		}

	}

}

