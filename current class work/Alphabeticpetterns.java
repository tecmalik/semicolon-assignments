public class Alphabeticpetterns{
	public static void main(String[] args){
	
		char alphabet = 'A';
		for(int pattern = 1 ; pattern <= 10 ; pattern++){
			System.out.println();
			for( int row = 1 ; row <= pattern ; row++){
				System.out.print(++alphabet);}
		}

for(int rowHandler = 1; rowHandler <= 10; rowHandler++){
			System.out.println();

			for(int patternHandler = 10; patternHandler >= rowHandler; patternHandler--)
				System.out.print("*"); 
		}




	}
		
}