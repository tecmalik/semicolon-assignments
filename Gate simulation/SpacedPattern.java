public class SpacedPattern{
	public static void main(String[] args){
	
		for(int row = 0; row<5 ; row++){
			
			
			for(int spaces = row; spaces<5; spaces++){
			System.out.print(" ");
			}
			
			int number = 1;
			
			for(int column2 = 0; column2<=row ; column2++){
			System.out.print(number +" ");
			 	number = number*(row-column2)/(column2+1);
			}
			
			System.out.println();
		}
	}
}