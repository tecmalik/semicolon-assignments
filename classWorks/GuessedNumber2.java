import java.util.Scanner;
public class GuessedNumber2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int guessedNumber = 0;
		int guessNumber = 67;
	while(guessedNumber != guessNumber){
		
		System.out.print("Guess the hidden number :");
		 guessedNumber = input.nextInt();

		
			
		if(guessedNumber > guessNumber && guessedNumber != guessNumber){
			System.out.print("number too high try again !!! ");
		}
		if(guessedNumber < guessNumber && guessedNumber != guessNumber){
			System.out.println("number too low try again !!! ");
		}
		else if (guessedNumber == guessNumber) {
			System.out.println("congratulations !!! ");
			
		}

	}
	
	}
}