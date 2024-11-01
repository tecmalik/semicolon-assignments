public class Numbertriangle{
	public static void main(String[] args){
		
		for(int length = 7 ; length >= 1 ; length-- ){
			
			for(int topSpaces = 1 ;  length >= topSpaces  ; topSpaces++ ){
				System.out.print(" ");
		
			}

			for(int topleft = 1 ; length <= topleft  ; topleft++ ){
			System.out.print( topleft );
		
			}
	
			for(int topright = 7 ; length >= topright  ; topright++ ){
			System.out.print( topright );
		
			}

			

		System.out.println();
		
		}


		

		
	} 
}