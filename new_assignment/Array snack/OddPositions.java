public class OddPositions{
	public static int[] oddPositions( int[] numbers){

		int[] oddPosition = new int[(numbers.length+1)/2];
		int oddIndex = 0;
		for (int count = 0; count< numbers.length ; count++){
			
			if (count%2 != 0){
				oddPosition[oddIndex] = numbers[count];
				oddIndex++;
			}
		}
		
		return oddPosition;
	}
}