package Chapter_5;

public class hollow_pyramid 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==5 || i==4&&j==2 || i==4&&j==4 || i==3&&j==3)
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
