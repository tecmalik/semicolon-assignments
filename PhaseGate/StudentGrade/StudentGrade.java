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
		int[][] passes = new int[studentNumber][2];
		
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
			int[] studentTotal = new int[studentNumber];
		for(int count = 0; count<studentTotal.length ; count++ ){
	
			studentTotal[count] = listTotal(studentGrade[count]); 
	
		}
		
		
		float[] studentAverage = new float[studentNumber];
		for(int count = 0; count<studentAverage.length ; count++ ){
	
			studentAverage[count] = studentTotal[count]/(float)numberOfSubjects; 
	
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