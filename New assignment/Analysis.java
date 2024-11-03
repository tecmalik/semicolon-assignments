import java.util.Scanner;
public class Analysis{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int passes = 0;
		int failures = 0;
		int studentsCounter = 1;
		int result = 0 ;
 		while (result != -1){
			System.out.print("Enter result (1 = pass, 2 = fail) or -1 to exit : ");
			result = input.nextInt();
			
			
			if (result == 1){
				passes = passes +1;
			}
			else if (result == 2){
				failures = failures +1 ;
			}
			else if (result != 2 || result != 1 || result != -1  ){
				System.out.println("incorrect input");
				
			}
		
		}
		
	System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
	if (passes > 8) { 
 		System.out.println("Bonus to instructor!"); 
	}


	}
}