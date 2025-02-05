import java.util.Scanner;
public class RefactoredNokia{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print(" Nokia menu");
		
		System.out.printf("\n sellect an option : \n1. phone book \n2. messages \n3. chats \n4. call \n5. Tones \n6. Settings \n7. call divert \n8. games \n9. calculator \n10. reminders \n11. clock \n12. profiles \n13. SIM services \n enter number : ");		
		System.out.print("Enter number :" );
		int menuList = input.nextInt();
				

		switch (menuList){
		case 1: 
			System.out.printf("\nPhone book  \n1. search \n2. Services Nos. \n3. Add name \n4. Erase \n5. Edit \n6. Assign tone \n7. send b'card \n8. Options \n9. speed dail \n10.Voice tags \n enter number : ");
			int phonebook = input.nextInt();
			switch(phonebook){
				case 1:
			    	System.out.print("search .......");
				break;
				case 2:
			    	System.out.print("service nos .......");
				break;
				case 3:
			    	System.out.print("Add name .......");
				break;
				case 4:
			    	System.out.print("Erase .......");
				break;
				case 5:
			    	System.out.print("Edit .......");
				break;
				case 6:
			    	System.out.print("Assign tone .......");
				break;
				case 7:
			    	System.out.print("send b'card .......");
				break;
				case 8:
			    	System.out.print("\nOptions \n1. Type of view \n2. Memory \n enter number :");
					int options = input.nextInt();
					switch(options){
						case 1 : 
						System.out.print("view...");
						break;
						case 2:
						System.out.print("\nmemory ....");
						break;
						default:
						System.out.print("invalid input");

						}
				break;
				case 9:
			    	System.out.print("\nSpeed dial .......");
				break;
				case 10:
			    	System.out.print("\nVoice tags .......");
				break;
				default:
				System.out.print("invalid input");
				}
		
	
		break;
		case 2:
			System.out.print(" \nMessages \n1. write messages \n2. inbox \n3. outbox \n4. picture messages \n5.Templates \n6. Smileys \n enter number :");
			int messageType = input.nextInt();
			switch(messageType){
			case 1:
			    System.out.print(" \nwrite message .......");
			break;
			case 2: 
				System.out.print("\ninbox messages.......");
			break;
			case 3: 
				System.out.print("\nOutbox messges .......");
			break;
			case 4:
				System.out.print("\n Picture messages ....... ");
			break;
			case 5: 
				System.out.print("\nTemplates .....");
			break;
			case 6: 
				System.out.print("\nSmileys .......");
			break;
			case 7: 
				System.out.print("\nmessages settings \n1. set 1 \n2. commom \n enter number :");
				int set = input.nextInt();
				switch(set){
				case 1: 
					System.out.print(" \n1. message Center number \n2. messages sent \n3. message validity \n enter number :");
					int message = input.nextInt();
					switch(message) {
					case 1:
						System.out.print(" \nMessage center number .... ");
					break;
					case 2:
						System.out.print(" \nmessage sent ...... ");
					break;
					case 3:
						System.out.print(" \n message validity .......");
					break;
					}

					
				break;	
				case 2: 
					System.out.print(" \nCommon \n1. Delivery report \n2. reply via same center \n3. character support \n enter number : ");
					int support = input.nextInt();
					switch(support){
					case 1:
						System.out.print(" \nDelivery report ..... ");
					break;
					case 2:
						System.out.print(" \nreply via same center ..... ");
					break;
					case 3:
						System.out.print(" \ncharacter support ..... ");
					break;
					}
				break;	
				}
			break;
			case 8 :
				System.out.print("\ninfo services  ");
			break;
			case 9 :
				System.out.print("\nVoice mailbox  ");
			break;
			case 10 :
				System.out.print("\nVoicemailbox  ");
			break;

			}
			
		case 3 :
			System.out.print("\n chats \n1. chats \nenter number");
			int chats = input.nextInt();
			switch(chats){
			case 1:
				System.out.print("chats .......");
			break;
			}
		break;
			
		case 4:
			System.out.print("\ncall register \n1 Missed calls \n2. Receive calls duration  \n3. dialled numbers \n enter number :  " );
			int register = input.nextInt();
			switch(register){
			case 1:
				System.out.print(" missed calls");
			break;
			case 2:
				System.out.print("Receive calls duration....");
			break;
			case 3:
				System.out.print(" dailled numeber ......");
			break;
			case 4:
				System.out.print("Erase recent call list ");
			break;
			case 5:
				System.out.print(" \nShow call duration \n1. last call duration \n2. All call's duration \n3. Received call's duration \n4. Dialled call's \n5. Clear timers\n enter number :");
				int show = input.nextInt();
				switch(show){
				case 1:
					System.out.print("last call duration");
				break;
				case 2:
					System.out.print("All call's duration");
				break;
				case 3:
					System.out.print("Received call's duration");
				break;
				case 4:
					System.out.print("Dialled call's");
				break;
				case 5:
					System.out.print("Clear timers");
				break;
				}
			break;
			case 6:
				System.out.print(" \nShow call cost \n1. last call cost \n2. All call's cost \n3. Clear Counters \n enter number :");
				int cost = input.nextInt();
				switch(cost){
				case 1:
					System.out.print("last call cost");
				break;
				case 2:
					System.out.print("All call's cost");
				break;
				case 3:
					System.out.print("Clear Counters");
				break;
				}
			break;
			case 7:
				System.out.print(" \n call cost settings \n1. call cost limit \n2. show costs in \n enter number : ");
				int settings = input.nextInt();
				switch(settings){
				case 1:
					System.out.print("call cost limit");
				break;
				case 2:
					System.out.print("show costs in");
				break;
				}

			break;
			case 8:
				System.out.print("prepaid credit");
			break;

			}
			
		break;
		case 5:
				System.out.print("\n Tones \n1. Ringing tone \n.2 Ringing volume \n3. incoming call alert \n4. Compose \n5. Messages \n6. Keypad tones \n7. warning and game tones\n8. Vibrating alert\n9. Screen saver \n enter number :");
				int tones = input.nextInt();
				switch(tones){
				case 1:
					System.out.print(" Ringing tone .....");
				break;
				case 2:
					System.out.print(" Ringing volume ..... ");
				break;
				case 3:
					System.out.print(" incoming call alert..... ");
				break;
				case 4:
					System.out.print(" Compose...... ");
				break;
				case 5:
					System.out.print(" Messages..... ");
				break;
				case 6:
					System.out.print(" Keypad tones..... ");
				break;
				case 7:
					System.out.print(" warning and game tones.... ");
				break;
				case 8:
					System.out.print(" Vibrating alert.......  ");
				break;
				case 9:
					System.out.print(" Screen saver..... ");
				break;
				}
		
		break;
		case 6:
				System.out.print(" \nSettings \n1. call settings \n2. Phone Settings \n3.Security Settings \nRestore factory settings \n enter number :");
				int settings = input.nextInt();
				switch(settings){
				case 1: 
					System.out.print("call settings \n1. Automatic redial \n2. Speed dailling \n3. Speed dialling \n4. Own number sending \n5. phone line in use \n6. Automatic answer \n enter number :");
					int callsettings = input.nextInt();
						switch(callsettings){
						case 1: 
							System.out.print("Automatic redial........");
						break;
						case 2: 
							System.out.print("Speed dailling......");
						break;
						case 3: 
							System.out.print("Speed dialling......");
						break;
						case 4: 
							System.out.print("Own number sending......");
						break;
						case 5: 
							System.out.print("phone line in use.....");
						break;
						case 6: 
							System.out.print("Automatic answer.....");
						break;
						}


				break;
				case 2: 
					System.out.print("Phone Settings \n1. language \n2. Cell info display \n3.Welcome note \n4. Network selection \n5. Light \n6. Confirm SIM service actions \n enter number :");
						int phonesettings = input.nextInt();
						switch(phonesettings){
						case 1: 
							System.out.print(" Language........");
						break;
						case 2: 
							System.out.print("Cell info display......");
						break;
						case 3: 
							System.out.print("Welcome Note......");
						break;
						case 4: 
							System.out.print("Network selection......");
						break;
						case 5: 
							System.out.print("Light.....");
						break;
						case 6: 
							System.out.print("Confirm SIM service actions.....");
						break;
						}

				break;
				case 3: 
					System.out.print("Securitysettings \n1. PIN code request \n2. Call barring service \n3. fixed dailing \n4. Closed user group \n5. phone security \n6. Change access codes \n enter number :");
						int securitysettings = input.nextInt();
						switch(securitysettings){
						case 1: 
							System.out.print(" PIN code request........");
						break;
						case 2: 
							System.out.print("Call barring service......");
						break;
						case 3: 
							System.out.print("fixed dailing......");
						break;
						case 4: 
							System.out.print("Closed user group......");
						break;
						case 5: 
							System.out.print("phone security.....");
						break;
						case 6: 
							System.out.print("Change access codes.....");
						break;
						}
				break;
				case 4: 
					System.out.print("Restore factory .........");
				break;
				}
		break;

		case 7:
				System.out.print(" Call divert...... ");
		break;
		case 8:
				System.out.print(" Games ");
		break;
		case 9:
				System.out.print(" Calculator ");
		break;
		case 10:
				System.out.print(" Reminders.... ");
		break;
		case 11:
				System.out.print(" Clock \n1. Alarm clock \n2. Clock setting \n3. Date Setting \n4. StopWatch \n5. Countdown timer \n6. Auto update 0f date and time \n enter number :");
					int clock = input.nextInt();
						switch(clock){
						case 1: 
							System.out.print(" Alarm clock........");
						break;
						case 2: 
							System.out.print("Clock setting......");
						break;
						case 3: 
							System.out.print("Date Setting......");
						break;
						case 4: 
							System.out.print("StopWatch ......");
						break;
						case 5: 
							System.out.print("Countdown timer.....");
						break;
						case 6: 
							System.out.print("Auto update 0f date and time.....");
						break;
						}

		break;
		case 12:
				System.out.print(" profiles.... ");
		break;
		case 13:
				System.out.print("SIM Services....");
		break;
		}


	
		
					
	}
}
