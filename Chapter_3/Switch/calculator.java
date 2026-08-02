package Switch;
import java.util.Scanner;

public class calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number a: ");
		float a=sc.nextFloat();
		System.out.print("Enter the number b: ");
		float b=sc.nextFloat();
		System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        switch (operator) 
        {
        case '+':
            System.out.print("Result = " + (a + b));
            break;

        case '-':
            System.out.print("Result = " + (a - b));
            break;

        case '*':
            System.out.print("Result = " + (a * b));
            break;

        case '/':
            if (b != 0) 
            	{
                System.out.print("Result = " + (a / b));
            	} 
            else 
            	{
                System.out.print("Error! Division by zero is not allowed.");
            	}
            break;
        }

	}
}
