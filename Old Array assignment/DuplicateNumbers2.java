import java.util.Scanner;
public class DuplicateNumbers2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int [] groupOfintegers = new int[13];
		
		for(int firstnumber=0; firstnumber<13; firstnumber++){
		System.out.print("Enter numbers : ");
			groupOfintegers[firstnumber] = input.nextInt();
		}
		
		System.out.print(" the list of duplicates are" );
		for(int firstindex = 0; firstindex<groupOfintegers.length ; firstindex++){
			 

			for(int counter = firstindex + 1; counter < groupOfintegers.length ; counter++){
				if(groupOfintegers[firstindex] == groupOfintegers[counter]){
					System.out.print(groupOfintegers[firstindex]+ " ");
					break;
				}
		
		
			}
		} 
	}
}