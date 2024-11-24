public class Intercepts{
	public static void main(String[] args){
	
	int [] firstset = {1,2,3,4};
	int [] secondset = {3,4,5,6};
	int [] intercept = new int[20];
	int index = 0;
	
	for(int count = 0; count<firstset.length; count++){
		
		
		for(int counter = 0 ; counter<secondset.length; counter++){
			if(firstset[count] == secondset[counter]){
				
				intercept[index] = firstset[count];
				index++;
			}
			
		}		
		
	}
	System.out.print("the intercepts is :");
	for(int display = 0; display<index; display++){
		System.out.print(intercept[display]+" , ");	
	}

	}
}