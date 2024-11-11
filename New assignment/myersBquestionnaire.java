import java.util.Scanner;
public class MyersBquestionnaire{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		String[][] myersBquestionnaire = {
	{"A. expend energy, enjoy groups" , "B. conserve energy, enjoy one on one\n"},
	{"A. Interpret literally" , "B. look for meaning and possibilities\n"},
	{"A. Logical, thinking, questioning" , "B. Empathetic, feeling, accommodating\n"},
	{"A. organized, orderly", "B. Flexible, adaptable\n"},
	{"A. more outgoing, think out loud" , "B. more reserved, think to yourself\n"},
	{"A. Practical, realistic, experiential" , "B. Imaginative, innovative, theoretical\n"},
	{"A. Candid, straight forward, frank" , "B. Tactful, kind, encouraging\n"},
	{"A. Plan, schedule" , "B. unplanned, Spontaneous\n"},
	{"A. Seek many tasks, public activities, interaction with others" , "B. seek private, solitary activities with quiet to concentrate\n"},
	{"A. Standard, usual, conventional" , "B. Different, novel, unique\n"},
	{"A. firm, tend to criticize, hold the line" , "B. gentle, tend to appreciate, conciliate\n"},
	{"A. regulated, structured" , "B. Easy-going, live and let live\n"},
	{"A. External, communicative, express yourself" , "B. Internal, reticent, keep to yourself\n"},
	{"A. Focus on here-and-now" , "B. Look to the future, global perspective, big picture\n"},
	{"A. tough-minded, just" , "B. tender-hearted, merciful\n"},
	{"A. preparation, plan ahead" , "B. go with the flow, adapt as you go\n"},
	{"A. Active, initiate" , "B. reflective, deliberate\n"},
	{"A. facts, things, what is" , "B. ideas, dreams , what could be, philosophical\n"},
	{"A. matter of fact, issue-oriented" , "B. sensitive, people-oriented, compassionate\n"},
	{"A. control, govern" , "B. latitude, freedom\n"},

	};
	int[] answer = new int[4];
	char[] answers = new char[20];
	System.out.println("What is your name?");
	String username = input.nextLine();
	
	for(int set=0; set<4; set++){
		int count = 0;

		for(int question = 0; question <= myersBquestionnaire.length; question++){
			System.out.print(myersBquestionnaire[question][0]);
			System.out.print(myersBquestionnaire[question][1]);

			char reply; 
			while(reply != 'A'&& reply !='B'){
				System.out.print("Select option A or B");
				reply = Character.toUpperCase(input.next().charAt(0));
			}
			if(reply == 'A'){
				count++;
			}
		}
		answer[set] = count;
            System.out.println("The number of A selected is: " + count);
            System.out.println("The number of B selected is: " + (5 - count));
            System.out.println();


	}
		

	}
}

