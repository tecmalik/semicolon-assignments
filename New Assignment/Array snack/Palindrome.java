public class Palindrome{
	public static Boolean checkingForPalindrome(String word){
		
		 for(int letter = 0 ; letter<word.length()/2; letter++){
			
			if word.charAt(letter) == word.charAt(word.length()-1-letter){
				return True;

			}
			else{
				return False;
			}
		}
	}
	
}  