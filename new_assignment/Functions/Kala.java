import java.util.Arrays;
public class Kala{
public static void main(String... args){
	
	System.out.println("kala functions");

	System.out.println(isEven(5));
	System.out.println(isPrimeNumber(23));
	System.out.println(subtract(7,3));
	System.out.println(divide(7,0));
	
	System.out.println(Arrays.toString(factorOf(10)));
	System.out.println(isSquare(25));
	System.out.println(isPalindrome(54145));
	System.out.println(factorialOf(5));
	System.out.println(squareOf(5));
}
	
	




	public static boolean isEven(int number){
		if (number % 2 == 0){
			return true;
		}
		return false;
	}


	public static boolean isPrimeNumber(int number){
		int numberOfTimes = 0;
		for(int count = 1; count < number+1 ; count++){
			if(number%count == 0 ){
				++numberOfTimes;
			}
			else if(numberOfTimes >= 2){
				return false;
			}
		}
		return true;
	}

	public static int subtract(int number1, int number2){
		if (number1>number2){
			return number1-number2;
			
		}
		else {
			return number2-number1;
		}
	

	}

	public static float divide(int number1, int number2){
		if(number2 == 0){
			return 0;
		}
		else {
			return (float)number1/number2;
		}
	}
	public static int[] factorOf(int number){
		int size = 0;
		for(int count =1; count< number+1; count++){
			if (number%count == 0){
				size++;
			}
		}

		int[] factors = new int[size];
		int index=0;
		for(int count =1; count < number+1; count++){
			if (number%count == 0){
				factors[index] = count;
				index++;
			}
		}
	
	return factors;
	}
	public static boolean isSquare(int number){
	
		for(int count=0; count< (number/2)+1; count++){
			if (count*count == number){
				return true;
			}
		}
		return false;
	}
	public static boolean isPalindrome(int number){
		if (number%10 == (number/10000) && (number/1000)%10 == (number/10)%10){
			return true;
		}
		return false;
		
	} 
	public static long factorialOf(int number){
		int factoria = 1;
		for(int count = number; count> 1 ; count--){
			factoria *= count;
		} 
		return factoria;
	}
	public static long squareOf(int number){
		return number*number;
	}

 

}