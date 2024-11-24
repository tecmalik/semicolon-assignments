public class CharacterPatterns{
	public static void main(String[] args){
	char count = 'A';
	while( count < 'E'){
		 count++;
		char alphabet= 'A';
		while(alphabet<count ){
			System.out.print(alphabet);
			 alphabet++;
		} alphabet = 'A';
		
		while( count < 'E'){
		 count++;
		alphabet = count;
		while(alphabet<count ){
			System.out.print(alphabet);
			 alphabet++;
		} alphabet = 'A';
		
	}
	

	System.out.println();
	}
	
	
	}

	
	
}