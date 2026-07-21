package Chapter_4;

public class sum_of_odd_numbers 
{

	public static void main(String[] args) 
	{
		int Sum=0;
		for(int i=1; i<=15; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i + " is Even");
				Sum += i;
			}
		}
		System.out.println(Sum + " ");
	}

}

