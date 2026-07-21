package Chapter_4;

public class even_and_odd_count 
{

	public static void main(String[] args) 
	{
		int SumO=0, SumE=0, CountO=0, CountE=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i + " is Odd");
				SumO += i;
				CountO++;
			}
			else
			{
				System.out.println(i + " is Even");
				SumE += i;
				CountE++;
			}
		}
		System.out.println("Sum of Odd " +SumO);
		System.out.println("Sum of Even " +SumE);
		System.out.println("Count Odd " +CountO);
		System.out.print("Count Even " +CountE);
	}

}
