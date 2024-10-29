import java.util.Scanner;
public class RandomNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int randomNumber = (int) (Math.random()*100);
		int randomGuess = 0;

		while (randomGuess != randomNumber){
			System.out.print("Enter a number between 1  to 100 number :");
			randomGuess = input.nextInt();
			if (randomGuess > randomNumber){
			System.out.print("too high, try again.");
			}
			else if (randomGuess < randomNumber){
			System.out.print("too low, try again.");
			}
			else if (randomGuess == randomNumber){
			System.out.print("success !, You guessed right.");
			}
			randomGuess++;
		}
		
	}
}