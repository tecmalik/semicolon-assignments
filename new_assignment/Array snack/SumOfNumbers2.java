public class SumOfNumbers2{
	public static int sumOfNumbers(int[] numbers){
		int sum = 0;
		int count = 0;
		while(count< numbers.length ){
			sum += numbers[count];  
			count++; 
		}
	return sum;
	}
	
	
} 