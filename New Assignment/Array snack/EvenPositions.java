public class EvenPositions{
	public static int[] evenPositions( int[] numbers){

		int[] evenPosition = new int[(numbers.length)/2];
		int evenIndex = 0;
		for (int count = 0; count< numbers.length ; count++){
			
			if (count%2 == 0){
				evenPosition[evenIndex] = numbers[count];
				evenIndex++;
			}
		}
		
		return evenPosition;
	}
}