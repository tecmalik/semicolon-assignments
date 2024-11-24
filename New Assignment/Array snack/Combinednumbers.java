public class CombinedList{
	public static int[] combinedList(int[] numbers1 , int[] numbers2){
		int[] combinedList = newnint[numbers1.length+numbers2.length];
		newRange1 = 0;
		newRange2 = 0;
		for(int range=0 ; range < combinedNumbers.length ; range++){
			if(range%2 != 0){
				combinedNumbers[range]= numbers1[newRange1];
				newRange1++;
			}
			else{
				combinedNumbers[range] =numbers2[newRange];
				newRange2++;
			}
		}
	
		return combinedNumbers;
	}
}