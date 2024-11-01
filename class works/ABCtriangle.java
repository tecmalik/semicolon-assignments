public class ABCtriangle{
	public static void main(String[] args){
		
		for(char length = 'A' ; length <= 'F' ; length++ ){
			
			for(char letter = 'F' ; length <= letter  ; letter-- ){
				System.out.print(" ");
		
			}

			for(char letter = 'A' ; length >= letter  ; letter++ ){
			System.out.print( letter );
		
			}
	
			for(char letter = 'A' ; length >= letter  ; letter++ ){
			System.out.print( letter );
		
			}

			

		System.out.println();
		
		}

		
		for(char length = 'A' ; length <= 'F' ; length++ ){
			
			for(char letter = 'A' ; length >= letter  ; letter++ ){
				System.out.print(" ");
		
			}

			for(char letter = 'A' ; length >= letter  ; letter++ ){
			System.out.print( letter );
		
			}
	

			

		System.out.println();
		
		}

		

		
	} 
}