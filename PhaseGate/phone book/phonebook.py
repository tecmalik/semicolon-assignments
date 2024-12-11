phoneNumbers = []
contactEmails = []
contactFirstNames = []
contactLastNames = []
contactAdresses = []

menu();


dev menu():
	choice = int(input("SELECT AN OPTION: \n1. Add Contact \n2. Remove Contact \n3. Find contact by Phone Number \n4. Find contact by First Name \n5. Edit contact by Last Name \n6. Edit contact \nEnter Number :"))
	if choice == 1:
		addToCart()
		menu()
	elif choice == 2 :
		removeFromCart()
		menu()
	elif choice == 3:
		findPhoneNumber()
		menu()
	elif choice == 4:
		findFirstName()
		menu()
	elif choice == 5:
		editlastName()
		menu()
	elif choice == 6:
		
	else :
		print("Invalid input !!!")


	
def addToCart():
			System.out.print("Enter First Name :");
			String contactFirstName  = input.nextLine();
			System.out.print("Enter Last Name :");
			String contactLastName  = input.nextLine();
			System.out.print("Enter Phone Number :");
			String phoneNumber = input.nextLine();
			System.out.print("Enter Contact Adress :");
			String contactAdress = input.nextLine();
			System.out.print("Enter Contact Email :");
			String contactEmail = input.nextLine();
			System.out.print("saved>>>>>>>>>>>>>>>");
	
			contactFirstNames.add(contactFirstName);
			contactLastNames.add(contactLastName);
			phoneNumbers.add(phoneNumber);
			contactAdresses.add(contactAdress);
			contactEmails.add(contactEmail); 
			System.out.printf("you Added %s to contact",contactFirstName);
	}
	public static void removeFromCart(){
		
		display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails);

		System.out.println("enter a number to delete the Contact : ");
		int index = input.nextInt();
					
		if(index <= contactFirstNames.size() && index > 0 ){
			
			contactFirstNames.remove(index-1);
			contactLastNames.remove(index-1);
			phoneNumbers.remove(index-1);
			contactAdresses.remove(index-1);
			contactEmails.remove(index-1); 
		display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails);
		}
		else{ 
		System.out.print("invalid input !!!");
		removeFromCart();
		}
	}
	public static void display(ArrayList<String> content1,ArrayList<String> content2,ArrayList<String> content3,ArrayList<String> content4,ArrayList<String> content5){
		System.out.printf("YOUR CONTACT LIST : ");
		System.out.println();
		for(int count = 0; count < content1.size() ; count++){
			System.out.printf("%d. %s %s%n %s%n%s%n%s%n", count+1,content1.get(count),content2.get(count),content3.get(count),content4.get(count),content5.get(count));
		System.out.println();
		}
	
	}
	
	public static int findName(ArrayList<String> allFirstName ){
		System.out.printf("Enter First Name to search in contact : ");
		input.nextLine();
		String nameToSearch  = input.nextLine();
		int nameSearched = allFirstName.indexOf(nameToSearch);
		return nameSearched;
	}


	public static void findFirstName(){
	
		int positionIndex = findName(contactFirstNames);
			if (positionIndex > -1){
			System.out.println(positionIndex);
		System.out.printf("Here you go:\n contact %s %s%n%s%n%s%n%s",contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex));
			menu();
			}
			else{ 
				System.out.print("contact mismatch try again !!!");
				menu();
			}
	
	
	}

	public static void findPhoneNumber(){
	
		int positionIndex = findPhoneNumber(phoneNumbers);
			if (positionIndex > -1){
			System.out.println(positionIndex);
		System.out.printf("Here you go:\n%s %s%n%s%n%s%n%s",contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex));
			menu();
			}
			else{ 
				System.out.print("contact mismatch try again !!!");
				menu();
			}
	} 
		public static int findPhoneNumber(ArrayList<String> allFirstName ){
		System.out.printf("Enter Phone Number to search in contact : ");
		input.nextLine();
		String nameToSearch  = input.nextLine();
		int nameSearched = allFirstName.indexOf(nameToSearch);
		return nameSearched;
		}
	
	public static void editlastName(){
	
		int positionIndex = editLastName(contactLastNames);
			if (positionIndex > -1){
			System.out.println(positionIndex);
		System.out.printf("Editing Name:\n%s %s%n%s%n%s%n%s",contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex));
				
			System.out.print("Edit First Name :");
			String contactFirstNameEdit  = input.nextLine();
			System.out.print("Edit Last Name :");
			String contactLastNameEdit  = input.nextLine();
			System.out.print("Edit Phone Number :");
			String phoneNumberEdit = input.nextLine();
			System.out.print("Edit Contact Adress :");
			String contactAdressEdit = input.nextLine();
			System.out.print("Edit Contact Email :");
			String contactEmailEdit = input.nextLine();
			System.out.print("saved>>>>>>>>>>>>>>>");
	
			contactFirstNames.add(positionIndex,contactFirstNameEdit);
			contactLastNames.add(positionIndex,contactLastNameEdit);
			phoneNumbers.add(positionIndex,phoneNumberEdit);
			contactAdresses.add(positionIndex,contactAdressEdit);
			contactEmails.add(positionIndex,contactEmailEdit); 
			System.out.printf("you Added %s to contact",contactFirstNameEdit);
			
			contactFirstNames.remove(positionIndex+1);
			contactLastNames.remove(positionIndex+1);
			phoneNumbers.remove(positionIndex+1);
			contactAdresses.remove(positionIndex+1);
			contactEmails.remove(positionIndex+1); 

		
			System.out.printf("Editing Name:\n%s %s%n%s%n%s%n%s",contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex));

			
			menu();
			}
			else{ 
				System.out.print("contact mismatch try again !!!");
				menu();
			}
	} 
		public static int editLastName(ArrayList<String> allFirstName ){
		System.out.printf("Enter Last name to Edit in contact : ");
		input.nextLine();
		String nameToSearch  = input.nextLine();
		int nameSearched = allFirstName.indexOf(nameToSearch);
		return nameSearched;
		}

	
	public static void editContact(){
	
		display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails);
		System.out.print("Enter number of contact to edit : ");
		int userPositionIndex = input.nextInt();
		int positionIndex = userPositionIndex-1;
			if (positionIndex <= contactFirstNames.size() && positionIndex > 0 ){
			
		System.out.printf("Editing Name:\n%s %s%n%s%n%s%n%s",contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex));
				
			System.out.print("Edit First Name :");
			String contactFirstNameEdit  = input.nextLine();
			System.out.print("Edit Last Name :");
			String contactLastNameEdit  = input.nextLine();
			System.out.print("Edit Phone Number :");
			String phoneNumberEdit = input.nextLine();
			System.out.print("Edit Contact Adress :");
			String contactAdressEdit = input.nextLine();
			System.out.print("Edit Contact Email :");
			String contactEmailEdit = input.nextLine();
			System.out.print("saved>>>>>>>>>>>>>>>");
	
			contactFirstNames.add(positionIndex,contactFirstNameEdit);
			contactLastNames.add(positionIndex,contactLastNameEdit);
			phoneNumbers.add(positionIndex,phoneNumberEdit);
			contactAdresses.add(positionIndex,contactAdressEdit);
			contactEmails.add(positionIndex,contactEmailEdit); 
			System.out.printf("you Added %s to contact",contactFirstNameEdit);
			
			contactFirstNames.remove(positionIndex+1);
			contactLastNames.remove(positionIndex+1);
			phoneNumbers.remove(positionIndex+1);
			contactAdresses.remove(positionIndex+1);
			contactEmails.remove(positionIndex+1); 

		
			System.out.printf("Editing Name:\n%s %s%n%s%n%s%n%s",contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex));

			display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails);
			menu();
			}
			else{ 
				System.out.print("contact mismatch try again !!!");
				menu();
