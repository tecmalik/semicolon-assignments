import java.util.Scanner;
public class StudentGrade{
	
	public static void main(String... args){

		Scanner input = new Scanner(System.in);
	 
		System.out.print("Enter number of Students");
		int studentNumber = input.nextInt();
		System.out.print("Enter number of Subjects");
		int numberOfSubjects = input.nextInt();
		
		String[] studentNames = new String[studentNumber];
		String[] studentSubjects = new String[numberOfSubjects];
		int[][] studentGrade = new int[studentNumber][numberOfSubjects]; 
		
		for(int count = 0; count<studentNames.length ; count++){
		
			System.out.print("Enter names of Students : ");
			studentNames[count] = input.nextLine();
		}	
		
		for(int count = 0; count<studentSubjects.length ; count++){
		
			System.out.print("Enter names of subject Students : ");
			studentSubjects[count] = input.nextLine();
		}	
	
	
	
		for(int count = 0; count<studentNames.length ; count++){
				
			System.out.print("Enter grade studentNames[count]");
			for(int counter = 0; counter<studentSubjects.length ; count++){
				
				System.out.print("Enter studentSubjects[counter] grade :");
					studentGrade[count][counter]  = input.nextInt();
			}
			
		}
			
		for(int count = 0; count<studentNumber.length ; count++ ){

	
	
	
		}
		
				






	}
	
	

	
	public static int listTotal( int[] scoresList ){
		int total = 0;
		for(int scores = 0; scores<scoresList.length; scores++){
			total+=scoresList[scores]; 
		}
		return total;
	}


	
}