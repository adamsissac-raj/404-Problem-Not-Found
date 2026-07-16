package Chapter_2;
import java.util.Scanner;

public class bmi_calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the weight : ");
		int weight=sc.nextInt();
		System.out.print("Enter the height in meters : ");
		float height=sc.nextFloat();
		float BMI= weight / (height * height);
		System.out.println("The BMI is " +BMI);
	}

}
