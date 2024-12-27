studentGrades = {}
studentnumber = int(input("Enter number of Students :"))
numberOfSubjects = int(input("Enter number of Subjects :"))
studentNames = []
studentSubject = []


def get_Hardest_add_easiest_subject(studentgrades:dict,subjects:list):
	totalpersubjects = []
	subjectkey = []
	passes = []
	faliures = []
	for subject in subjects:
		subjectname = ''
		total = 0
		pas = 0
		fails = 0
		for student in studentGrades:
			if studentGrades[student][subject] >= 45:
				pas += 1
			else:
				fails += 1 
			total += studentGrades[student][subject]
			subjectkey = subject		
		totalpersubjects.append(total)
		subjectkey.append(subjectname)
		passes.append(pas)
		faliures.append(fails)

	highest = get_highest(totalpersubjects)
	lowest = get_lowest(totalpersubjects)
	hardest_subject = " "
	hardest_failure = 0
	easiest_passes = 0
	for count in range len(subjectkey):
		if get_highest(totalpersubjects) == totalpersubjects[count]:
			easiest_subject = subjectkey[count]
			easiest_passes = passes[count]
		if get_lowest(totalpersubjects) == totalpersubjects[count]:
			hardest_subject = subjectkey[count]
			hardest_failure = failures

	return highest, lowest, easiest_subject , hardest_subject 

def get_lowest(numbers:list):
	lowest = 100
	for count in numbers:
		if count < lowest:
			lowest = count
	return lowest


def get_highest(numbers:list):
	highest = 0
	for count in numbers:
		if count > highest:
			highest = count 
	return highest 
	

def get_list_total(numbers:list):
	total = 0 
	for number in numbers:
		total += number
	return total

def overall_lowest_score(studentGrades:dict ):
	lowest = 100
	display_subject = " "
	name = " "
	for student in studentGrades:
		for subject in studentSubject:
			if studentGrades[student][subject] < lowest:
				lowest = studentGrades[student][subject]
				display_subject = subject
				name = student
			
	return lowest,	display_subject, name



def overall_highest_score(studentGrades:dict ):
	highest = 0
	display_subject = " "
	name = " "
	for student in studentGrades:
		for subject in studentSubject:
			if studentGrades[student][subject] > highest:
				highest = studentGrades[student][subject]
				display_subject = subject
				name = student
			
	return highest,	display_subject, name
	

	
def subjectTotal(studentGrades:dict):
	totals = []
	for subject in studentGrades:
		total = 0
		for student in studentGrades[subject]:
			total += studentGrades[subject][student]	
		totals.append(total)
	return totals

def passesAndFailures(studenGrades:dict, subjects:list):
	passes = []
	fails = []
	for subject in subjects:
		passed = 0
		failed = 0
		for student in studentGrades:
			if studentGrades[student][subject] >= 45 :
				passed += 1
			else:
				failed += 1
		passes.append(passed)
		fails.append(failed)
	return passes , fails

def getLowestPerSubject(studentgrades:dict,subjects:list):
	lowestStudents = []
	subjectkey = []
	for subject in subjects:
		lowest = 100
		subjectname = ''
		for student in studentGrades:
			if studentGrades[student][subject] < lowest :
				lowest = studentGrades[student][subject]
				subjectname = student
		lowestStudents.append(lowest)
		subjectkey.append(subjectname)
		
				
	return lowestStudents, subjectkey



def getHighestPerSubject(studentgrades:dict,subjects:list):
	highestStudents = []
	subjectkey = []
	for subject in subjects:
		highest = 0
		subjectname = ''
		for student in studentGrades:
			if studentGrades[student][subject] > highest :
				highest = studentGrades[student][subject]
				subjectname = student
		highestStudents.append(highest)
		subjectkey.append(subjectname)
		
				
	return highestStudents, subjectkey



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

print()
print("Student Summary")
print()
highestScores , highestStudents = getHighestPerSubject(studentGrades , studentSubject)
lowestScores , lowestStudents = getLowestPerSubject(studentGrades , studentSubject)
numberOfPasse , numberOfFailures = passesAndFailures(studentGrades, studentSubject)
totals = subjectTotal(studentGrades)
overall_highest, overall_highest_subject, overall_highest_name = overall_highest_score(studentGrades)  
overall_lowest, overall_lowest_subject, overall_lowest_name = overall_lowest_score(studentGrades)
overall_total= get_list_total(getEachStudentTotal(studentSubject, studentGrades))


highest_subject, lowest_subject, easiest_subject , hardest_subject  = get_Hardest_add_easiest_subject(studentgrades,subjects)




count = 0
for subject in studentSubject:
	print()
	print(f"{subject}")
	print(f"the highest scoring is  {highestStudents[count]} scoring {highestScores[count]} ")
	print(f"the lowest scoring student is {lowestStudents[count]} {lowestScores[count]} scoring ")
	print(f"total is : {totals[count]}")
	print(f"Average is : {round(totals[count]/studentnumber , 3)}")
	print(f"number of passes : {numberOfPasse[count]}")
	print(f"number of failes : {numberOfFailures[count]}")
	print()
	print("--------------------------------------------------------------------------------------------")
	count += 1


get_highest(numberOfPasse)
get_lowest(numberOfPasse)
#print(f"the hardest Subject is {} with {} faliures")
#print(f"The easiest Subject is {} with {} passes")
print(f"the overall Highest score scored by {overall_highest_name} in {overall_highest_subject} scoring {overall_highest}")
print(f"the overall lowest score scored by { overall_lowest_name} in {overall_lowest_subject} scoring {overall_lowest}")
print("==========================================================================================")
print()

print("Class Summary")
print("==========================================================================================")
#print("best Graduating Student is : {} Scoring {} ")
print("==========================================================================================")
print()
print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
#print("Worse Graduationg Student is : {} scpring {}")
print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
print()
print("==========================================================================================")
print(f"Class Total Score is : {overall_total} ")
print(f"Class Aversge Score is : {overall_total/studentnumber} ")
print("==========================================================================================")
