import java.util.Scanner;
public class Alphabet{
	public static void main(String[] args){
	
		Scanner input= new Scanner(System.in);
		System.out.println("Enter any alphabet : ");
		char alphabet = input.nextLine().charAt(0);
		
		if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U' || alphabet == 'a' || alphabet == 'e' ||alphabet ==  'i' || alphabet == 'o' || alphabet == 'u' ){
			System.out.print(alphabet+" is a vowel");
		}
		else if (alphabet == 'B' || alphabet =='b') {
			System.out.print(alphabet+" is a consonant");
		}

else if ( alphabet =='C' || alphabet == 'c' ){
			System.out.print(alphabet+" is a consonant ");
		}
else if ( alphabet =='D' || alphabet == 'd' ){
			System.out.print(alphabet+" is a consonant");
		}
else if (alphabet == 'F' || alphabet =='f' ){
			System.out.print(alphabet+" is a consonant");
		}
else if (alphabet == 'G' || alphabet =='g' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='H' || alphabet =='h' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='J' || alphabet =='j' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='K' || alphabet =='k'){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='L' || alphabet =='l' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='M' ||alphabet == 'm'){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='N' ||alphabet == 'n'){
			System.out.print(alphabet+" is a consonant");
		}
else if (alphabet == 'P' || alphabet =='p' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='Q' || alphabet =='q' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='R' || alphabet =='r' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='S' ||alphabet == 's' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='T' ||alphabet == 't' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='V' || alphabet =='v' ){
			System.out.print(alphabet+" is a consonant");
		}
else if (alphabet == 'W' || alphabet =='w' ){
			System.out.print(alphabet+" is a consonant");
		}
else if (alphabet == 'X' ||alphabet == 'x' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='Y' || alphabet =='y' ){
			System.out.print(alphabet+" is a consonant");
		}
else if ( alphabet =='Z' || alphabet == 'z' ){
			System.out.print(alphabet+" is a consonant");
		}
else  {
			System.out.print("Error  ..invalid Alphabet..");
		}
		
	}

}