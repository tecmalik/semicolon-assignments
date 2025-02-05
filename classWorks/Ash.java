public class Ash{
	public static void main(String[] args){
		for(int length = 6 ; length>=1 ; length--){
			for(int spaces = 6 ; spaces>=length; spaces--){
				System.out.print(" ");
			}
			for(int pattern = 1; pattern<=length ; pattern++){
				System.out.print("*");
			}
			
			for(int spaces = 1 ; spaces<=length; spaces++){
				System.out.print(" ");
			}
			for(int pattern = 6; pattern>=length ; pattern--){
				System.out.print("*");
			}
			for(int spaces = 6 ; spaces>=length; spaces--){
				System.out.print(" ");
			}
			for(int pattern = 1; pattern<=length ; pattern++){
				System.out.print("*");
			}


		System.out.println();
		}
		

	}
	
}