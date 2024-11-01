
public class Whiletest{
	public static void main(String[] args){
		
		int counter = 1;
		while (counter<7){
				
			
			int number = 1;
			++counter;
		
			while(number<10){
				
		
				System.out.print(counter +" X "+ number +"  = "+number * counter +" \t");
				number++;
			} 
			System.out.println();
			
		}

	}
}