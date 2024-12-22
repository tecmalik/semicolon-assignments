studentGrades = {}
studentnumber = int(input("Enter number of Students :"))
numberOfSubjects = int(input("Enter number of Subjects :"))
studentNames = []
studentSubject = []


def getLowestPerSubject(studentgrades:dict):
	lowestStudents = []
	name = []
	for subject in studentGrades:
		lowest = 100
		lowestStudent = ' '
		for student in studentGrades[subject]:
			if studentGrades[subject][student] < lowest :
				lowest = studentGrades[subject][student]
				lowestStudent = student
		lowestStudents.append(lowest)
		name.append(lowestStudent)
	return lowestStudents, name



def getHighestPerSubject(studentgrades:dict):
	highestStudents = []
	name = []
	for subject in studentGrades:
		highest = 0
		highestStudents = ' '
		for student in studentGrades[subject]:
			if studentGrades[subject][student] > highest :
				highest = studentGrades[subject][student]
				highestStudent = student
		highestStudents.append(highest)
		name.append(highestStudent)
				
	return highestStudents, name



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


def getEachStudentTotal(studentSubject:list , studentGrades:dict):
	total = []
	for student in studentGrades:
		sum = 0
		for grade in studentSubject :
			sum += studentGrades[student][grade]
		total.append(sum)
			
	return list(total)


for count in range(studentnumber):
	name = input(f"Enter {count+1} Student names : ")
	studentNames.append(name)

for count in range(numberOfSubjects):
	subject = input(f"Enter Students Subjects {count+1} : ") 
	studentSubject.append(subject)

for name in studentNames:
	studentGrades[name] = {}
	for subject in studentSubject:
		grade = int(input(f"Enter {name} grade for {subject} : "))
		#if grade <= 100 and grade >= 0 :
		studentGrades[name][subject] = grade 
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
for subjects in studentGrades :
	print(f"{subjects}",end="")
	for grade in studentSubject :
		print("\t%s" %(studentGrades[subjects][grade]),end="")
	print("%10d"%(getEachStudentTotal(studentSubject,studentGrades)[count]),end="")
	print("%11d"%((getEachStudentTotal(studentSubject,studentGrades)[count])/(numberOfSubjects)),end="")
	print("%13d"%(getPosition(getEachStudentTotal(studentSubject,studentGrades))[count]))
	count += 1
	print()

print("Student Summary")
for grade , name in getLowestPerSubject(studentGrades):
	print (f"{grade } -- {name}")

print(getLowestPerSubject(studentGrades))
print(getHighestPerSubject(studentGrades))

