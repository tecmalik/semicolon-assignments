public class AsteriskTest{
	public static void main(String[] args){
	
		 for( int number = 1; number <= 6; number++ ){
			for(int spaces = 6; spaces>=number ; spaces--){
				System.out.print(" ");
			}
			for(int pattern = 1 ; pattern<=number ; pattern++){
				System.out.print(" ");
			}

		System.out.println();
		}
		for( int number = 1; number <= 6; number++ ){
			
			
			for(int pattern = 6 ; pattern>=number ; pattern--){
				System.out.print(" ");
			}

		System.out.println();
		}
		
		





	}
}