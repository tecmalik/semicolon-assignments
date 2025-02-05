import java.util.Scanner;
public class Gradeloop{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int counter = 0;
		while(counter < 5){
			System.out.println("Enter student grade :");
			int grade = input.nextInt();
				counter++;
			if (grade < 50){
				System.out.println("D");
			}
			else if (grade >= 50 && grade <= 60){
				System.out.println("C");
			}
			else if (grade > 60 && grade <= 80){
			System.out.println("D");
			}
			else if (grade >= 80 && grade <= 100){
			System.out.println("A");
			}

		}
			 
		
	}
}