studentGrade = {}
studentnumber = int(input("Enter number of Students :"))
numberOfSubjects = int(input("Enter number of Subjects :"))
studentNames = []
studentSubject = []




for count in range(studentnumber):
	name = input(f"Enter {count+1} Student names : ")
	studentNames.append(name)

for count in range(numberOfSubjects):
	subject = input(f"Enter Students Subjects {count+1} : ") 
	studentSubject.append(subject)

for name in studentNames:
	studentGrade[name] = {}
	for subject in studentSubject:
		grade = int(input(f"Enter {name} grade for {subject} :"))
		studentGrade[name][subject] = grade 



	

print(studentGrade)





def listtotal(numbers:list):
	total = 0
	for integer in number:
		total += integer
	return total
