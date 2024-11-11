
public class ArrayMaxandMin{
	public static void main(String[] args){
	
		int[] arrayvalues = {34,54,65,45,34,56,72,33};
		
		int maxNumber = 0;
		int minNumber = 0;
		int initialNumber=0;
		for(int count = 0; count<arrayvalues.length; count++){
			 initialNumber = arrayvalues[count];
			if(initialNumber > maxNumber){
				maxNumber = initialNumber;
			}
			minNumber=initialNumber;
			if(initialNumber < minNumber){
				minNumber = initialNumber;
			}

			

		}
			System.out.println("The Maximum Number of Array is "+maxNumber);
			System.out.println("The Minimum Number of Array is "+minNumber);	
			
	}
		
	
}