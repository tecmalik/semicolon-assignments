import java.util.Scanner;
public class MyersBquestionnaire2{
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
	  int[] counts = new int[4];

	System.out.println("What is your name?");
	String username = input.nextLine();	
	

        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = i; j < 20; j += 4) {
                System.out.print(myersBquestionnaire[j][0] + " " + myersBquestionnaire[j][1] + "\nSelect A or B: ");
                String response;
		while (true) {
                    response = input.next();
                    if (response.equalsIgnoreCase("A") || response.equalsIgnoreCase("B")) {
                        break;
                    	}
			else {
                        System.out.print("Invalid input. Please select A or B: ");
                    	}
                }
                if (response.equalsIgnoreCase("A")) {
                    count++;
               	 }
            }
            counts[i] = count;
            System.out.println("The number of A selected is: " + count);
            System.out.println("The number of B selected is: " + (5 - count));
            System.out.println();
        }

        String mbtiType =
            (counts[0] > 2 ? "E" : "I") +
            (counts[1] > 2 ? "S" : "N") +
            (counts[2] > 2 ? "T" : "F") +
            (counts[3] > 2 ? "J" : "P");

       
        System.out.println(username + "'s MBTI type is: " + mbtiType);
    


        switch (mbtiType) {
            case "ENFJ":
                System.out.println("ENFJ (Protagonist) is a personality type with the Extroverted, Intuitive, Feeling, and Judging traits. They are charismatic and inspiring leaders, often driven to help others realize their potential.");
                break;
            case "ENTJ":
                System.out.println("ENTJ (Commander) is a personality type with the Extroverted, Intuitive, Thinking, and Judging traits. Bold and imaginative, they are strong-willed leaders who enjoy organizing and directing people and projects.");
                break;
            case "INFP":
                System.out.println("INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. Idealistic and loyal to their values, they are driven by their beliefs and desire to make the world a better place.");
                break;
            case "INTJ":
                System.out.println("INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians love perfecting the details of life, applying creativity and rationality to everything they do. Their inner world is often a private, complex one.");
                break;
            case "ESFJ":
                System.out.println("ESFJ (Consul) is a personality type with the Extroverted, Sensing, Feeling, and Judging traits. Caring and social, they have a strong sense of duty and are eager to help others.");
                break;
            case "ESTJ":
                System.out.println("ESTJ (Executive) is a personality type with the Extroverted, Sensing, Thinking, and Judging traits. Organized and driven, they focus on results and managing tasks efficiently.");
                break;
            case "ISFP":
                System.out.println("ISFP (Adventurer) is a personality type with the Introverted, Sensing, Feeling, and Prospecting traits. Creative and spontaneous, they value freedom and often express themselves through art and other forms of creativity.");
                break;
            case "ISTP":
                System.out.println("ISTP (Virtuoso) is a personality type with the Introverted, Sensing, Thinking, and Prospecting traits. They tend to have an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness and personal skill, varying their approach as needed.");
                break;
            case "ENFP":
                System.out.println("ENFP (Campaigner) is a personality type with the Extroverted, Intuitive, Feeling, and Prospecting traits. Enthusiastic and creative, they have a strong sense of possibility and are driven by their values and ideas.");
                break;
            case "ENTP":
                System.out.println("ENTP (Debater) is a personality type with the Extroverted, Intuitive, Thinking, and Prospecting traits. Quick-witted and clever, they enjoy the challenge of ideas and often think outside the box.");
                break;
            case "INTP":
                System.out.println("INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness to experiment with personal creativity.");
                break;
            case "ISFJ":
                System.out.println("ISFJ (Defender) is a personality type with the Introverted, Sensing, Feeling, and Judging traits. Warm and conscientious, they have a strong sense of duty and take pride in their responsibilities.");
                break;
            case "ISTJ":
                System.out.println("ISTJ (Logistician) is a personality type with the Introverted, Sensing, Thinking, and Judging traits. These people tend to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with methodical purpose.");
                break;
            case "ESFP":
                System.out.println("ESFP (Entertainer) is a personality type with the Extroverted, Sensing, Feeling, and Prospecting traits. Outgoing and spontaneous, they enjoy life in the moment and often seek new experiences.");
                break;
            case "ESTP":
                System.out.println("ESTP (Entrepreneur) is a personality type with the Extroverted, Sensing, Thinking, and Prospecting traits. Bold and perceptive, they take action to make things happen and enjoy living on the edge."); 
                break;
            case "INFJ":
                System.out.println("INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of humanism guide them in all things.");
                break;
            default:
                System.out.println("Your personality type is not recognized.");
                break;
		}

        }
   
}
