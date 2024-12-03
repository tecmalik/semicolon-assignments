studentNumber = int(input("Enter number of Students :"))
numberOfSubjects = int(input("Enter number of Subjects :"))
studentNames = []
studentSubjects = []
studentGrade = []
studentTotal = []
for count in range (studentNumber):
	studentNames.append(input("Enter name of Student : "))
for count in range (numberOfSubjects):
	studentSubjects.append(input("Enter student Subjects : "))
for count in range (studentNumber):
	print("Enter grade "+ studentNames[count])
	for index in range(numberOfSubjects):
		studentGrade.append(int(input("Enter Grade of Student : ")))
	print("Saving>>>>>>>>>>>>")

