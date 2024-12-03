import java.util.Scanner;
public class StudentGrade{
	
	public static void main(String... args){

		Scanner input = new Scanner(System.in);
	 
		System.out.println("Enter number of Students");
		int studentNumber = input.nextInt();
		System.out.println("Enter number of Subjects");
		int numberOfSubjects = input.nextInt();
		
		
		String[] studentNames = new String[studentNumber];
		String[] sortstudentNames = new String[studentNumber];
		String[] studentSubjects = new String[numberOfSubjects];
		int[][] studentGrade = new int[studentNumber][numberOfSubjects]; 
		int[][] passesAndfaliures = new int[studentNumber][2];
		
		input.nextLine();
		for(int count = 0; count<studentNames.length ; count++){
			
			System.out.println("Enter names of Students : ");
			studentNames[count] = input.nextLine();
			sortstudentNames[count] = studentNames[count];
		}	
		
		for(int count = 0; count<studentSubjects.length ; count++){
		
			System.out.println("Enter names of subject Students : ");
			studentSubjects[count] = input.nextLine();
		}	
	
	
	
		for(int count = 0; count<studentNumber ; count++){
				
			System.out.println("Enter grade "+ studentNames[count] );
			
			for(int counter = 0; counter<numberOfSubjects ; counter++){
				int passes = 0;
				int failures = 0;
				System.out.printf("Enter %s  grade :",studentSubjects[counter]);
				
					studentGrade[count][counter]  = input.nextInt();
					if (studentGrade[count][counter]<0 || studentGrade[count][counter]>100){
						System.out.print(" invalid !!! \nEnter a valid grade !!!");
						--counter;
					}
					else if ( studentGrade[count][counter] > 45  ){
						++passes;
						passesAndfaliures[count][0] = passes;
					}
					else if ( studentGrade[count][counter] < 45  ){
						++failures;
						passesAndfaliures[count][1] = failures ;
					}
			
				
				System.out.println("Saving>>>>>>>>>>>>>>>>>>>>");
			}
			
			
		}
			int[] studentTotal = new int[studentNumber];
			int[] sortedStudentTotal = new int[studentNumber];
		for(int count = 0; count<studentTotal.length ; count++ ){
		
			studentTotal[count] = listTotal(studentGrade[count]); 
			sortedStudentTotal[count]= studentTotal[count];
		}
		
		
		float[] studentAverage = new float[studentNumber];
		for(int count = 0; count<studentAverage.length ; count++ ){
	
			studentAverage[count] = studentTotal[count]/(float)numberOfSubjects; 
	
		}

		
		
		for(int count = 0; count<sortedStudentTotal.length ; count++){ 
		
			for(int counter = 1; counter < sortedStudentTotal.length-1-count; counter++){

				

				if (sortedStudentTotal[counter] > sortedStudentTotal[counter+1]){
				int container = sortedStudentTotal[counter+1]; 
				String namesContainer = sortstudentNames[counter+1];
					sortedStudentTotal[counter+1] = sortedStudentTotal[counter];
					sortstudentNames[counter+1] = sortstudentNames[counter];

					sortedStudentTotal[counter] = container;
					sortstudentNames[counter] = namesContainer;
				
				}
			
			}
	
	
		}





				
	System.out.println("========================================================================== ");
	System.out.print("Student");
		for(int count=0 ; count<studentNumber; count++){
		System.out.print("	"+studentSubjects[count]);
		
		}
	System.out.print("      ToT");
	System.out.print("      AVE");
	System.out.println("    	  pos");
	System.out.println("========================================================================== ");


		for(int count=0 ; count< studentNumber ; count++){
			System.out.print(studentNames[count]);
			for(int index = 0 ; index < studentSubjects.length ; index++){
			
				System.out.printf("	" + studentGrade[count][index] ); 
								
			} 
			System.out.print("	"+studentTotal[count]);
			System.out.printf("	 %.2f",studentAverage[count]);
			System.out.print(sortstudentNames[count]+"  "+ studentTotal[count]+" is "+ count+1 +" position ");
			
		System.out.println();		
		}

		
		for(int count=0 ; count< studentNumber ; count++){
		
			System.out.printf(" studentNames[count]	passed : " + passesAndfaliures[count][0] +" failed:"+passesAndfaliures[count][1]);
			
			System.out.println();		
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