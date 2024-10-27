
public class PowerTable{
	public static void main(String[] args){
	
		System.out.println("a\t b\t power(a , b)\t");
		int alphabetA = 0;
		int alphabetB = alphabetA + 1;
		int counterNumber = 1;
			
			while(counterNumber <= 5) {
				alphabetA = alphabetA + 1;
				alphabetB = alphabetA + 1;
				System.out.println(alphabetA + "\t" + alphabetB + "\t" +  (int)Math.pow(alphabetA,alphabetB) + "\n" );
				counterNumber = counterNumber + 1;
			}
	
	}		 

}