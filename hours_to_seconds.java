package Chapter_2;
import java.util.Scanner;

public class hours_to_seconds 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for Hour: ");
		int h = sc.nextInt();
		int s=3600*h;
		System.out.println("Hrs in Seconds is " +s);
	}

}
