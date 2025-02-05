public class Patterns{
	public static void main(String[] args){
		int count = 0;
		char star = '*';
		char star2 = '*';
		while(count < 7){
			System.out.print(star);
			
			while(count < 6){
				System.out.print(star);
				count++; 
			}
		 
			count++;
		} 
		
	}
} 