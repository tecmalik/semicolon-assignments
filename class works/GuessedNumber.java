import java.util.Scanner; 
public class GuessedNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int guessNumber = 67;
		System.out.print("guess the hidden number :");
		int guessedNumber = input.nextInt();
		
		if(guessedNumber > guessNumber){
			System.out.print("number too high try again !!! ");
		}
		if(guessedNumber < guessNumber){
			System.out.println("number too low try again !!! ");
		}
		else {
			System.out.println("congratulations !!! ");
		}

	}
}