package Chapter_5;

public class reverse_pattern_printing 
{

	public static void main(String[] args) 
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i ;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
