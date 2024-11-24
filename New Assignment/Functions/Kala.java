public class Kala{
public static void main(String... args){
	
	System.out.println("kala functions");

	System.out.println(isEven(5));
	System.out.println(isPrimeNumber(23));
	System.out.println(subtract(7,3));
	System.out.println(divide(7,0));
	System.out.println(factorOf(10));


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
	


}