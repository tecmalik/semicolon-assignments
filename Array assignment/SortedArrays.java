public class SortedArrays{
	public static void main(String[] args) {
        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 6};
        int[] combinedArray = new int[firstArray.length + secondArray.length];
	int counter = 0;
	for(int count = 0; count < combinedArray.length; count++){
		if(count < firstArray.length){
			combinedArray[count] = firstArray[count];
		}
		else {
			
			combinedArray[count] = secondArray[counter];
			counter++;
		}
	}
	
	
	for(int move= 0; move<combinedArray.length; move++){
	int container=0;
	for(int index = 0; index < combinedArray.length -1 - move; index++ ){
		
		
		if(combinedArray[index]>combinedArray[index+1]){
		container = combinedArray[index +1];
		combinedArray[index+1] = combinedArray[index];
		combinedArray[index] =  container;
		

		} 
		
	
	}System.out.print(combinedArray[move]+" ");
	}


	
	
	 
	}	
}
