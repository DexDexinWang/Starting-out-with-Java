import java.util.Scanner;
import java.util.Random;
public class MathRandom 
{
	public void example()
	{
		int number1;
		int number2;
		int sum;
		int userAnswer;
		
		Scanner keyboard=new Scanner(System.in);
		
		Random randomNumber=new Random();
		
		number1= randomNumber.nextInt(100);
		number2=randomNumber.nextInt(100);
		
		System.out.println("What is the answer to the following problem?");
		System.out.println(number1 + " + " + number2 +" = ?");
		
		sum=number1+number2;
		
		userAnswer=keyboard.nextInt();
		
		if(userAnswer == sum)
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.printf("Sorry, wrong answer. The correct answer is %d. \n", sum);
		}
	}
}
