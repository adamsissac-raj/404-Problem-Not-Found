package Chapter_5;

public class hollow_inverse_right_angle_triangle 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 || i==1 || i==4&&j==2 || i==3&&j==3 || i==2&&j==4)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		System.out.println("Completed");

	}
}
