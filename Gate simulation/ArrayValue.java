import java.util.Scanner;
public class ArrayValue{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int[] arraynumbers = new int[7];
		
			arraynumbers[0] = 23;
			arraynumbers[1] = 35;
			arraynumbers[2] = 33;
			arraynumbers[3] = 56;
			arraynumbers[4] = 67;
			arraynumbers[5] = 54;
			arraynumbers[6] = 44;
		int count = 0;
		int commonvalue = 0;
		System.out.println("Enter a value :");
		int uservalue = input.nextInt();		
		for(count = 0; count<arraynumbers.length; count++){
		
			if (uservalue == arraynumbers[count]){
				commonvalue = arraynumbers[count];
			}
		
			
		}
		if(commonvalue != 0){
			System.out.println( commonvalue+" is on the array list");

		}
			
		else{
			System.out.println(uservalue +" is not in the array list");
		}	
			
	}
		
	
}