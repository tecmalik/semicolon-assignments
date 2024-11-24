public class LargestNumber{
	public int largestNumber(int [] numbers){
	
	int largestNumber = number[0];
	
	for(int counter = 0; counter<numbers.length ; counter++){
	
		if (numbers[counter] > largestNumber){
			largestNumber = numbers[counter];
		}
	}
	return largestNumber;
	

	
	}
	
}