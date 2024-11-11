public class OPattern{
	public static void main(String[] args){
	
		for(int row = 1; row<=5 ; row++){
			
			
			for(int asterisk = 1; asterisk <5; asterisk ++){
				if(asterisk  == 1 || asterisk==4){
					System.out.print("*");
				}
				else if(row == 1 || row==5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

						
			System.out.println();
		}
	}
}