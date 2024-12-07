import java.util.Scanner;
	public class CardValidator{

	static Scanner input = new Scanner(System.in);

	public static void main(String... args){
	
		long[] test = {4,3,8,8,5,7,6,0,1,8,4,0,2,6,2,6};
		System.out.println(getSummedSquareOfReversedEvenPosition(test));
	System.out.println(getSumOfReversedOddPosition(test));

	
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
		for(int count = numbers.length-2; count >= 0 ; count-=2){
		
			if( (((numbers[count]) * 2) < 10)){ 
				totalOfEvenSquares += ((numbers[count]) * 2);
			
			}else{
			
				totalOfEvenSquares +=(((numbers[count]) * 2)/10 )+ (((numbers[count]) * 2)%10);

			
			}
		
		}
		
			
	return totalOfEvenSquares;
	}

	public static long getSumOfReversedOddPosition(long[] numbers){
		long totalOfOddPosition = 0;
		for(int count = numbers.length-1 ; count > 0 ; count-=2){

				totalOfOddPosition += numbers[count];
		}
		
			
	return totalOfOddPosition;
	}



}