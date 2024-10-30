public class Ash{
	public static void main(String[] args){
		for(int length = 1 ; length<=6 ; length++){
			for(int spaces = 6 ; spaces>=length; spaces-- ){
				System.out.print(" ");
			}
			for(int pattern = 1; pattern<=length ; pattern++){
				System.out.print("*");
			}
		System.out.println();
		}
		

	}
	
}