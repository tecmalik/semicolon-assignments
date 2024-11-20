public class AsteriskPattern{
	public static void main(String[] args){
	
	for(int count = 0; count<7; count++){
		for(int counter=0; counter<count;counter++){
			System.out.print("*");
		}

		for(int counter=5; counter>count;counter--){
			System.out.print(" ");
		}

		
		for(int counter=6; counter>count;counter--){
			System.out.print(" ");
		}

		
		for(int counter=0; counter<count;counter++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	}

	
	
}