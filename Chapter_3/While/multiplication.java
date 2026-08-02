package While;
import java.util.Scanner;

public class multiplication 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table number: ");
		int n= sc.nextInt();
		System.out.println("Enter the no of Multiples: ");
		int mult= sc.nextInt();
		int i=1;
		while(i<=mult)
		{
			System.out.println(n +" * "+ i + " = " + n*i);
			i++;
		}
	}

}
