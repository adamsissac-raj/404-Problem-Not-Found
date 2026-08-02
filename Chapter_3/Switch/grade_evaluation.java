package Switch;
import java.util.Scanner;

public class grade_evaluation 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Grade (O, A+, A, B+, B, C, U): ");
        String grade = sc.next();

        switch (grade) 
        {
            case "O":
                System.out.println("Outstanding");
                break;

            case "A+":
                System.out.println("Excellent");
                break;

            case "A":
                System.out.println("Very Good");
                break;

            case "B+":
                System.out.println("Good");
                break;

            case "B":
                System.out.println("Above Average");
                break;

            case "C":
                System.out.println("Average");
                break;

            case "U":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid Grade!");
        }

        sc.close();
    }

}
