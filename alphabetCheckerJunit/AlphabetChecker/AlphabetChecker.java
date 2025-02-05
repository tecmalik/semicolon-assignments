public class AlphabetChecker{
 	public static boolean ispangram(String sentence){

		if (sentence.length()<26){
		return false;
		}
	
	
		int checked = 0;
		for(int count= 0 ; count < 26; count++){
			char alphabet = 'a';
			for(int counter = 0; counter< sentence.length() ; counter++){
			
				if(alphabet == sentence.charAt(counter)){
				checked++;
				break;
			}
			
		}
	
		
	}
	if(checked == 26){
	return true; 
	}
	
		return false;
	
	}

}