from unnitTest import TestCase
import studentgrade

class StudentGrade(TestCase):
	def test_if_student_case_exist(self):
		studentgrade.get_listtotal([2,3,4,5,5,])
	