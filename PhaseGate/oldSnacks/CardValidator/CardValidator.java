import java.util.Scanner;
	public class CardValidator{

	static Scanner input = new Scanner(System.in);

	public static void main(String... args){
	
		System.out.print("Enter Credit-Card number : ");
		long cardNumber = input.nextLong();
		if (cardLength(cardNumber) == true){

			long[] cardDigits = firstDigitValue(cardNumber);
		for(int count = 0; count < cardDigits.length ; count++){
				if (cardDigits[0] == 4){	
					getSummedSquareOfReversedEvenPosition(cardDigits);
				}
				else if (cardDigits[0] == 5){	
					getSummedSquareOfReversedEvenPosition(cardDigits);

				}
				else if (cardDigits[0] == 3 && cardDigits[1]== 7 ){
					getSummedSquareOfReversedEvenPosition(cardDigits);

				}
				else if (cardDigits[0] == 6){
					getSummedSquareOfReversedEvenPosition(cardDigits);

				}
				else{
					System.out.print("Card is Not Valid");
				}
		}

			}
			else{System.out.print("Card is Not Valid");
			}
		
	
	
			
	}
	
	public static boolean cardLength(long cardNumber){
		int numberlength = String.valueOf(cardNumber).length();
		
			if (numberlength<13 || numberlength>16){
				return false;
			}
			
		return true;
	}
	
	
	public static long[] firstDigitValue(long numbers){
		long[] firstDigit = new long[String.valueOf(numbers).length()];
		int count = 0;
		while(numbers > 0){
			firstDigit[count] = numbers % 10;
			numbers = numbers/10;
			count++;
		}
	return firstDigit;
	}
	
	public static long getSummedSquareOfReversedEvenPosition(long[] numbers){
		long totalOfEvenSquares = 0;
		for(int count = numbers.length; count > 0 ; count--){
		
			if( (numbers[numbers.length-1-count] * numbers[numbers.length-1-count]) < 10){ 
				totalOfEvenSquares += (numbers[numbers.length-1-count] * numbers[numbers.length-1-count]);
			
			}else{
			
				totalOfEvenSquares += (numbers[numbers.length-1-count] * numbers[numbers.length-1-count])%10;
				totalOfEvenSquares +=(numbers[numbers.length-1-count] * numbers[numbers.length-1-count])/10;

			
			}
		
		}
		
			
	return totalOfEvenSquares;
	}

	//public Static long getSummedSquareOfReversedOddPosition(long[] numbers){



	//}


}