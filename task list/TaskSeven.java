public class TaskSix{
	public static void main(String[] args){	
		
		for(int number = 1 ; number <= 10 ; number++){
		if((number % 4) == 0 ) {
		for(int power = 1 ; power <= 5 ; power++){
		 int sum = ((int)Math.pow(number , power));
		 System.out.print(" ");
			
			System.out.print(sum);
		}
		
		}
		
		}
	}
}