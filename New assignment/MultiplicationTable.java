
public class MultiplicationTable{
	public static void main(String[] args){
		

		
		int numberCounter = 1;

	
		while(numberCounter < 10){

			int number = 1;
			while (number < 10) {
		  	System.out.print(number + " x " + numberCounter + " = ");
		  	System.out.printf("%2d\t", number * numberCounter);
			number++;

			} 
		  System.out.println();
		  numberCounter++;
		} 
	}
  }