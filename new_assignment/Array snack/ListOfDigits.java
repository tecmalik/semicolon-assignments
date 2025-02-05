public class ListOfDigits{
	public static int[] listOfDigits(int number){
		int size = 0;
		int counter = number;
		for(int count = 0; counter>0 ; count++){
			counter = counter/10;
			++size;
		}
		
		int[] digitsList = new int[size]
		for(int count = 0; count<digitsList.length ; count++){
			digitsList[digitsList.length - 1 -count] = number%10;
			number = number/10;
			
		}

	return digitsList

	}



} 