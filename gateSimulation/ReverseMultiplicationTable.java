
public class ReverseMultiplicationTable{
	public static void main(String[] args ){
			
		for(int count = 0; count < 11 ; count++){
			for(int number = 11 ; number > 1 ; number--){
				System.out.print(count+" x "+number+ " = "+ number*count +"\t" );
			}
			System.out.println(" ");
				
		}
	
	}
}
