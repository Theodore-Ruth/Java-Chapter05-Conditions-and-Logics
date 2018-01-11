import java.util.Random;
import java.util.Scanner;

public class Exercise_7 {
	
	
	public static void main(String[] args) 
	{
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100(including both). Can you guess what it is?");
		startGuessing(number);
		System.out.println("You got it!");
	}
	
	public static void askForGuess()
	{
		System.out.print("Type a number: ");
	}
	
	public static void startGuessing(int num)
	{
		
		
		askForGuess();
		
		Scanner in = new Scanner(System.in);
		int userGuess = in.nextInt();

		if( num > userGuess)
		{
			System.out.println("Too low");
			System.out.println("");
			startGuessing(num);
		}
		else if(num < userGuess)
		{
			System.out.println("Too high");
			System.out.println("");
			startGuessing(num);
		}
	}

}
