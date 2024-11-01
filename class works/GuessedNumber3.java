import java.util.Scanner;
public class GuessedNumber3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int guessedNumber = 0;
		int guessNumber = (int)Math.random()*100;
	while(guessedNumber != guessNumber){
		
		System.out.println("Guess the hidden number :");
		 guessedNumber = input.nextInt();
				
		if(guessedNumber > guessNumber){
			System.out.print("number too high try again !!! ");
		}
		else if(guessedNumber < guessNumber){
			System.out.println("number too low try again !!! ");
		}
		 else  {
			System.out.println("congratulations !!! ");
			
		}

	}
	
	}
}