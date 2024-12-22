studentGrade = {}
studentnumber = int(input("Enter number of Students :"))
numberOfSubjects = int(input("Enter number of Subjects :"))
studentNames = []
studentSubject = []

def getHighestPerSubject(studentgrade:dict):
	highestStudents = []
	name = []
	highest
	for student in studentGrade:
		
		for subject in studentGrade:
			if 
			
	return highest






def getPosition(numbers:list):
	position = numbers
	sortedNumbers = sorted(numbers) 
	sortedNumbers.sort(reverse=True)
	count = 1
	for grade in sortedNumbers:
		index = 0
		for check in range(len(numbers)):

			if grade == numbers[index]:
				position[index] = count
			index += 1
		count += 1
	return position


def getEachStudentTotal(studentSubject:list , studentGrade:dict):
	total = []
	for student in studentGrade:
		sum = 0
		for grade in studentSubject :
			sum += studentGrade[student][grade]
		total.append(sum)
			
	return list(total)


for count in range(studentnumber):
	name = input(f"Enter {count+1} Student names : ")
	studentNames.append(name)

for count in range(numberOfSubjects):
	subject = input(f"Enter Students Subjects {count+1} : ") 
	studentSubject.append(subject)

for name in studentNames:
	studentGrade[name] = {}
	for subject in studentSubject:
		grade = int(input(f"Enter {name} grade for {subject} : "))
		#if grade <= 100 and grade >= 0 :
		studentGrade[name][subject] = grade 
		print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>")
		print("Saved Suceessfully")
		#else :
		print("invalid input !!!")

print("=================================================================================")
print("Student",end="")
for subject in studentSubject:
	print(f"	{subject}",end="" )
print("\t",end="")

print("%-10s%-11s%-13s " %("Total" , "AVE" ,"POS"))
print("=================================================================================")
count = 0
for subjects in studentGrade :
	print(f"{subjects}",end="")
	for grade in studentSubject :
		print("\t%s" %(studentGrade[subjects][grade]),end="")
	print("%10d"%(getEachStudentTotal(studentSubject,studentGrade)[count]),end="")
	print("%11d"%((getEachStudentTotal(studentSubject,studentGrade)[count])/(numberOfSubjects)),end="")
	print("%13d"%(getPosition(getEachStudentTotal(studentSubject,studentGrade))[count]))
	count += 1
	print()

	


