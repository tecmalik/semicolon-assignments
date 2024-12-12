phoneNumbers = []
contactEmails = []
contactFirstNames = []
contactLastNames = []
contactAdresses = []

menu();


def menu():
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
		print("exit")
	else:
		print("Invalid input !!!")


def addToCart():
	contactFirstName = input("Enter First Name :")
	contactFirstNames.append(contactFirstName)
	contactLastName  = input("Enter Last Name :")
	contactLastNames.append(contactLastName)
	phoneNumber = input("Enter Phone Number :")
	phoneNumbers.append(phoneNumber)
	contactAdress = input("Enter Contact Adress :")
	contactAdresses.append(contactAdress)
	contactEmail = input("Enter Contact Email :")
	contactEmails.append(contactEmail)
	print("saved>>>>>>>>>>>>>>>")
	print("you Added %s to contact"%(contactFirstName))

	
def removeFromCart():
	display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails)
	index = int(input("enter a number to delete the Contact : "))
	if index <= len(contactFirstNames) and index > 0 :
		contactFirstNames.remove(index-1)
		contactLastNames.remove(index-1)
		phoneNumbers.remove(index-1)
		contactAdresses.remove(index-1)
		contactEmails.remove(index-1)
		display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails)
	else:
		print("invalid input !!!")
		removeFromCart()


def display(ArrayList<String> content1,ArrayList<String> content2,ArrayList<String> content3,ArrayList<String> content4,ArrayList<String> content5):
	print("YOUR CONTACT LIST : ")
	for count in range (len(content1)):
	print("%d. %s %s%n %s%n%s%n%s%n", %(count+1,content1.get(count),content2.get(count),content3.get(count),content4.get(count),content5.get(count)))
	
def findName([] allFirstName):
	nameToSearch  = input("Enter First Name to search in contact : ")
	nameSearched = allFirstName.index(nameToSearch)
	return nameSearched

def findFirstName():
	int positionIndex = findName(contactFirstNames)
	if positionIndex > -1:
		print(positionIndex)
		print("Here you go:\n contact %s %s%n%s%n%s%n%s"%(contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex)))
		menu()
	else:
		print("contact mismatch try again !!!")
		menu()

def findPhoneNumber():
	int positionIndex = findPhoneNumber(phoneNumbers);
	if positionIndex > -1:
		print(positionIndex)
		print("Here you go:\n%s %s%n%s%n%s%n%s",%(contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex)))
		menu()
	
	else:
		print("contact mismatch try again !!!")
		menu()
		
def findPhoneNumber([] allFirstName ):
	nameToSearch = input("Enter Phone Number to search in contact : ")
	nameSearched = allFirstName.index(nameToSearch)
	return nameSearched
	
def editlastName():
	int positionIndex = editLastName(contactLastNames);
	if positionIndex > -1:
		print(positionIndex)
		print("Editing Name:\n%s %s%n%s%n%s%n%s",%(contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex)))				
		contactFirstNameEdit  = input("Edit First Name :")
		contactFirstNames.append(positionIndex,contactFirstNameEdit)
		contactLastNameEdit  = input("Edit Last Name :")
		contactLastNames.append(positionIndex,contactLastNameEdit)
		phoneNumberEdit = input("Edit Phone Number :")
		phoneNumbers.append(positionIndex,phoneNumberEdit)
		contactAdressEdit = input("Edit Contact Adress :")
		contactAdresses.append(positionIndex,contactAdressEdit)
		contactEmailEdit = input("Edit Contact Email :")
		contactEmails.append(positionIndex,contactEmailEdit)
		print("saved>>>>>>>>>>>>>>>")
	
		print("you Added %s to contact",%(contactFirstNameEdit))
			
		contactFirstNames.remove(positionIndex+1)
		contactLastNames.remove(positionIndex+1)
		phoneNumbers.remove(positionIndex+1)
		contactAdresses.remove(positionIndex+1)
		contactEmails.remove(positionIndex+1)

		print("Editing Name:\n%s %s%n%s%n%s%n%s",%(contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex)))
		menu()
	else:
		print("contact mismatch try again !!!")
		menu()

def editLastName([] allFirstName ):
	nameToSearch  = input("Enter Last name to Edit in contact : ")
	nameSearched = allFirstName.index(nameToSearch);
	return nameSearched
		

	
def editContact():
	display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails)
	userPositionIndex = input("Enter number of contact to edit : ")
	positionIndex = userPositionIndex-1
	if positionIndex <= contactFirstNames.size() && positionIndex > 0:
		print("Editing Name:\n%s %s%n%s%n%s%n%s",%(contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex)))
		contactFirstNameEdit  = input("Edit First Name :")
		contactLastNameEdit  = input("Edit Last Name :")
		phoneNumberEdit = input("Edit Phone Number :")
		contactAdressEdit = input("Edit Contact Adress :")
		contactEmailEdit = input("Edit Contact Email :")
		print("saved>>>>>>>>>>>>>>>")

		contactFirstNames.append(positionIndex,contactFirstNameEdit)
		contactLastNames.append(positionIndex,contactLastNameEdit)
		phoneNumbers.append(positionIndex,phoneNumberEdit)
		contactAdresses.append(positionIndex,contactAdressEdit)
		contactEmails.append(positionIndex,contactEmailEdit); 
		print("you Added %s to contact"%(contactFirstNameEdit))
			
		contactFirstNames.remove(positionIndex+1)
		contactLastNames.remove(positionIndex+1)
		phoneNumbers.remove(positionIndex+1)
		contactAdresses.remove(positionIndex+1)
		contactEmails.remove(positionIndex+1)

		print("Editing Name:\n%s %s%n%s%n%s%n%s",%(contactFirstNames.get(positionIndex),contactLastNames.get(positionIndex),phoneNumbers.get(positionIndex),contactAdresses.get(positionIndex),contactEmails.get(positionIndex)))

		display(contactFirstNames,contactLastNames,phoneNumbers,contactAdresses,contactEmails)
		menu()
			
	else:
		print("contact mismatch try again !!!")
		menu()
