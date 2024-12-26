import java.util.Scanner;
public class StudentGrade{

	static Scanner input = new Scanner(System.in);



	
	public static void main(String... args){

		 collectStudentsInputs();

		
	}
	public static void collectStudentsInputs(){

		System.out.println("Enter number of Students : ");
		int studentNumber = input.nextInt();
		System.out.println("Enter number of Subjects : ");
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
		}	
		
		for(int count = 0; count<studentSubjects.length ; count++){
		
			System.out.println("Enter names of subject Students : ");
			studentSubjects[count] = input.nextLine();
		}
		
		for(int count = 0; count<studentNumber ; count++){
				
			System.out.println("Enter grade "+ studentNames[count] );
			int failures = 0;
			int passes = 0;
			for(int counter = 0; counter<numberOfSubjects ; counter++){
				
				
				System.out.printf("Enter %s  grade :",studentSubjects[counter]);
				
					studentGrade[count][counter]  = input.nextInt();
					
					if (studentGrade[count][counter]<0 || studentGrade[count][counter]>100){
						System.out.print(" invalid !!! \nEnter a valid grade !!!");
						--counter;
					}
					if (studentGrade[count][counter] >= 45){
						passes +=1;
						passesAndfaliures[count][0] = passes;
					}
					if ( studentGrade[count][counter] < 45  ){
						failures+=1;
						passesAndfaliures[count][1] = failures ;
					}
			
				
				System.out.println("Saving>>>>>>>>>>>>>>>>>>>>");
			}
			

			
			
			
		}
		
	for(int count = 0 ; count < studentNumber ; count++){

		System.out.println(getSort(eachStudentTotal(studentGrade, studentNumber))[count]+" ******");

	}
	
	
	System.out.println("========================================================================== ");
	System.out.print("Student");
		for(int count=0 ; count<studentSubjects.length; count++){
			System.out.printf("	%s",studentSubjects[count]);
		
		}
	System.out.printf("%9s ","ToT");
	System.out.printf("%11s","AVE");
	System.out.printf("%14s ","pos");
	System.out.println();
	System.out.println("========================================================================== ");


		for(int count=0 ; count< studentNumber ; count++){
		
		System.out.print(studentNames[count]);
			for(int index = 0 ; index < studentSubjects.length ; index++){
				System.out.printf("	" + studentGrade[count][index] ); 
			} 
		System.out.printf("%10d	",eachStudentTotal(studentGrade, studentNumber)[count]);
		System.out.printf("%11.2f",((float)(eachStudentTotal(studentGrade, studentNumber)[count])/numberOfSubjects));
		System.out.printf("%14d",position(getSort(eachStudentTotal(studentGrade, studentNumber)) ,eachStudentTotal(studentGrade, studentNumber) )[count]+1);
		
		System.out.println();		
		}
		
		
		System.out.println("========================================================================== \n\n========================================================================== ");
		System.out.println();





		highestAndLowestPreSubject( numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade));
		totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade));
		passesAndFailuresOfEachSubjects( numberOfSubjects , studentNumber , eachSubjects(numberOfSubjects, studentNumber ,studentGrade));
		highestInteger(totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade)));
		lowestInteger(totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade)));
		
		




	
		System.out.println("STUDENT SUMMARY");
		System.out.println("--------------------------------------------------------------------------------");
		for(int index = 0; index < numberOfSubjects ; index++){
			
	
				System.out.println( studentSubjects[index] );
				System.out.print("Highest Scoring Student is ");
				for(int count=0; count < numberOfSubjects ; count++){
					if(highestAndLowestPreSubject(numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count][0] == studentGrade[count][index]){
						System.out.printf("%s%s Scoring :%d \n", studentNames[count], studentNames[count] , highestAndLowestPreSubject(numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count][0]);
					}
				} 
				System.out.print("lowest Scoring Student is ");
				for(int count=0; count < numberOfSubjects ; count++){

					if(highestAndLowestPreSubject( numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count][1] == studentGrade[count][index]){
						System.out.printf(" %s%s Scoring : %d \n ", studentNames[count] , studentNames[count] ,highestAndLowestPreSubject( numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count][1]);
					}
				}
				System.out.printf(" Total Score is : %d",totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[index]);
				System.out.println();
				System.out.printf(" Average Score Score is : %.3f%n",(float)totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[index]/studentNumber);
				System.out.printf(" Number of Passes: %d \n Number of failures is : %d%n",passesAndFailuresOfEachSubjects(numberOfSubjects , studentNumber , eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[index][0] ,passesAndFailuresOfEachSubjects(numberOfSubjects , studentNumber , eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[index][1] ); 
				System.out.println("--------------------------------------------------------------------------------");
				

		} 


		
		
		for(int count=0; count < numberOfSubjects ; count++){
			if (lowestInteger(totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade))) == totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count] ){
				System.out.printf("The hardest subject is %s with number %d\n ", studentSubjects[count], passesAndFailuresOfEachSubjects(numberOfSubjects , studentNumber , eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count][1] );
				
			}
		}
		for(int count=0; count < numberOfSubjects ; count++){
			if (highestInteger(totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade))) == totalPreSubject(numberOfSubjects,eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count] ){
				System.out.printf("The easiest subject is %s with number %d\n " , studentSubjects[count] , passesAndFailuresOfEachSubjects(numberOfSubjects , studentNumber , eachSubjects(numberOfSubjects, studentNumber ,studentGrade))[count][0] );
				
			}
		}
		
		for(int count = 0 ; count < numberOfSubjects ; count++){
			for(int index = 0 ; index < studentNumber ; index++){
				if (  overallHighest( highestAndLowestPreSubject(numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade)) , numberOfSubjects) == eachSubjects(numberOfSubjects, studentNumber ,studentGrade)[count][index]){
					System.out.printf("The ovarall highest score is Scored by %s in %s Scoring %d \n", studentNames[index], studentSubjects[count] , overallHighest( highestAndLowestPreSubject(numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade)) , numberOfSubjects)); 
				}
			}
		}


		for(int count = 0 ; count < numberOfSubjects ; count++){
			for(int index = 0 ; index < studentNumber ; index++){
				if ( overallLowest( highestAndLowestPreSubject(numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade)) , numberOfSubjects) == eachSubjects(numberOfSubjects, studentNumber ,studentGrade)[count][index]){
					System.out.printf("The ovarall lowest score is Scored by %s in %s Scoring %d \n", studentNames[index], studentSubjects[count] , overallLowest( highestAndLowestPreSubject(numberOfSubjects, eachSubjects(numberOfSubjects, studentNumber ,studentGrade)) , numberOfSubjects)); 
				}
			}
		}



		System.out.println("Class Summary");
		System.out.println("========================================================================");
		System.out.println("Best Graduating Student is : "); 
		System.out.print("========================================================================\n\n\n");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");		
		System.out.println("Worse Graduating Student is : "); 
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
		System.out.println("========================================================================");
		System.out.println("Class Total : ");
		System.out.println("Class Average Score is : ");
		System.out.println("========================================================================");

		
	}


	public static int listTotal( int[] scoresList ){
		int total = 0;
		for(int scores = 0; scores<scoresList.length; scores++){
			total+=scoresList[scores]; 
		}
		return total;
	}
	
	public static int[] eachStudentTotal(int[][] studentGrade, int studentNumber){
		int[] studentTotal = new int[studentNumber];	
		for(int count = 0; count<studentTotal.length ; count++ ){
		
			studentTotal[count] = listTotal(studentGrade[count]); 
			
		}
		return studentTotal;
	}


	public static int[] getSort(int[] sortedStudentTotal){
		for(int count = 0; count < sortedStudentTotal.length-1 ; count++){ 
		
			for(int counter = 0; counter < sortedStudentTotal.length-1-count; counter++){

				if (sortedStudentTotal[counter] < sortedStudentTotal[counter + 1]){
				int container = sortedStudentTotal[counter + 1]; 
				sortedStudentTotal[counter + 1] = sortedStudentTotal[counter];
				sortedStudentTotal[counter] = container;
					
				
				}
			
			
			}
	
	
		} 
		return sortedStudentTotal;
	}

	public static int[] position(int[] sortedTotal , int[] studentTotal ){
		
		int[] position = new int[sortedTotal.length];

		for(int count = 0; count<sortedTotal.length ;count++){
				 
			for(int index = 0; index < sortedTotal.length; index++){
				
				if (sortedTotal[count] == studentTotal[index]){
					
					position[index] = count ;
					
				}
			}
		}
		return position;
	}
	
	

	public static int[][] eachSubjects(int numberOfSubjects, int studentNumber ,int[][] studentGrade){
		int[][] eachSubjects = new int[numberOfSubjects][studentNumber];
		for(int index = 0 ; index<numberOfSubjects ; index++){
			for(int count = 0 ; count<studentNumber ; count++){
				eachSubjects[index][count] = studentGrade[count][index];
			}		
		}
		return eachSubjects;
	}

	public static int[][] highestAndLowestPreSubject(int numberOfSubjects, int[][] eachSubjects){
		int[][] highestAndLowestPreSubject = new int [numberOfSubjects][2]; 
		for(int index=0; index<numberOfSubjects ; index++){
			
		highestAndLowestPreSubject[index][0] = highestInteger(eachSubjects[index]);
		highestAndLowestPreSubject[index][1] = lowestInteger(eachSubjects[index]);
		
		}
		return highestAndLowestPreSubject;
	}

	public static int highestInteger(int[] numbers){
		int largest = numbers[0];
		for(int count = 0; count<numbers.length;count++){
			if(numbers[count]>largest){
				largest = numbers[count];
			}
		} 
	return largest; 
	
	}

	public static int lowestInteger(int[] numbers){
		int lowest = numbers[0];
		for(int count = 0; count<numbers.length;count++){
			if(numbers[count]<lowest){
				lowest = numbers[count];
			}
		} 
	return lowest;
	
	}


	public static int[] totalPreSubject(int numberOfSubjects, int[][] eachSubjects){
				
		int[] totalPreSubject = new int [numberOfSubjects]; 
		for(int index=0; index<numberOfSubjects ; index++){
			totalPreSubject[index] = listTotal(eachSubjects[index]);
			
		}
	return totalPreSubject;
	}

	
	public static int[][] passesAndFailuresOfEachSubjects(int numberOfSubjects , int studentNumber, int[][] eachSubjects ){
		
		int[][] passesAndFailuresOfEachSubjects = new int[numberOfSubjects][2];
		for(int index=0;index<numberOfSubjects; index++){
			for(int innerIndex=0; innerIndex < studentNumber ;innerIndex++){
				if(eachSubjects[index][innerIndex] > 45){
					passesAndFailuresOfEachSubjects[index][0] +=1;
				}
				else{
					passesAndFailuresOfEachSubjects[index][1] +=1; 
				}
			}
		}
		return passesAndFailuresOfEachSubjects;	
	}
	
	
	public static int overallHighest(int[][] highestAndLowestPreSubject , int numberOfSubjects){
		int[] allHighest = new int[numberOfSubjects];
		for(int count = 0 ; count< numberOfSubjects ; count++){
			allHighest[count] = highestAndLowestPreSubject[count][0];
		}
		return highestInteger(allHighest);
			
	}
	
	public static int overallLowest(int[][] highestAndLowestPreSubject , int numberOfSubjects){
		int[] allLowest = new int[numberOfSubjects];
		for(int count = 0 ; count< numberOfSubjects ; count++){
			allLowest[count] = highestAndLowestPreSubject[count][1];
		}
		return lowestInteger(allLowest);
			
	}




	

}