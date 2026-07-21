package Chapter_3;
import java.util.Scanner;

public class grade_system 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks Obtained: ");
		float mark=sc.nextFloat();
		{
			if(mark>=90)
			{
				System.out.println("Grade Obtained O ");
			}
			else if(mark>=80 && mark<=89)
			{
				System.out.println("Grade Obtained A+ ");
			}
			else if(mark>=70 && mark<=79)
			{
				System.out.println("Grade Obtained A ");
			}
			else if(mark>=60 && mark<=69)
			{
				System.out.println("Grade Obtained B+ ");
			}
			else if(mark>=50 && mark<=59)
			{
				System.out.println("Grade Obtained B ");
			}
		}
	}

}
