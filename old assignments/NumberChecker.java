import java.util.ArrayList;
public class NumberChecker{
	
	public static void main(String[] args){
	
	
		
	
	}
	
	public static String getNumber(int number, int[] numbers){
		String index = "";
		for (int count = 0 ; numbers.length > 0; count++){
			if(numbers[count] == number){
				index = String.valueOf(count);	
				return index;
			
			}
		}
	
	return "not available";
	}
	public static String searchNumber(int number, int[] numbers){
		int index = "";
		for (int count = 0 ; numbers.length > 0; count++){
			if(numbers[count] == number){
				index = count;	
				return String.format("the number %d is present at index %d", number,index);
			
			}
		}
	
	return "not available";
	}

	/**public static String getPositiveNagativeAndZeros(int[] numbers){
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		
		for(int count = 0; count< number.length ; number++){
			if(number[count] > 0){
				positive++;
			}
			if(number[count] < 0){
				negative++;
			}
			if(number[count] == 0){
				zeros++;
			}

		
		}
		String PositiveNagativeAndZeros = "the number of positive is " +(String)positive +"the number of negative is "+ (String)negative +"the number of zeros is "+ (String)zeros +" " ;
		return 
	}		
	*/
	
}