public class ConcatenatedList{
	public static int[] concatinatedList(int[] numbers1 , int[] numbers2){
		int[] concateNatednumbers = new int[numbers1.length+numbers2.length];
		newRange = 0;
		for(int range=0 ; range < concatenatedNumbers.length ; range++){
			if(range<= numbers1.length){
				concatinatedNumbers[range]= numbers1[range];
			}
			else{
				concatinatedNumbers[range] =numbers2[newRange];
				newRange++;
			}
		}
	
		return concatinatedNumbers;
	}
}