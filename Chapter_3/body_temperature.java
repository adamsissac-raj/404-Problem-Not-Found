package Chapter_3;
import java.util.Scanner;
public class body_temperature 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your body temperature in °F: ");
		float temp=sc.nextFloat();
		if(temp >= 97.0 && temp <= 99.0 )
		{
			System.out.println("Your Body Temperature is Normal");
		}
		else
		{
			System.out.println("You have an Abnormal Body Temperature");
		}
	}

}
 