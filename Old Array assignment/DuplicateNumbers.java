public class DuplicateNumbers{
	public static void main(String[] args){
		
		int [] groupOfintegers = {2,4,3,4,5,6,7,7,2,3,1,11,15};
		
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