public class SumOfNumbers3{
	public static int sumOfNumbers3(int[] numbers){
		int sum = 0;
		int count = 0;
		do{
			sum += numbers[count];  
			count++; 
		}while(count< numbers.length);
	return sum;
	}
	
	
} 