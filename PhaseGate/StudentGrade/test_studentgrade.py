from unnitTest import TestCase
import studentgrade

class StudentGrade(TestCase):
	def test_if_getEachStudentTotal_exist(self):
		studentgrade.getEachStudentTotal(["maths","english"] , {malik:{maths:56},jame:{english:45}})
	def test_if_getEachStudentTotal_returns_a_list(self):
		value = studentgrade.getEachStudentTotal(["maths","english"] , {malik:{maths:56,english:50},jame:{maths:30 , english:45}})
		expected = [106, 75]
		self.assertEqual(value,expected)

	def test_if_getPosition_exist(self):
		value = studentgrade.getPosition([23,4,5,67,9])
		expected = [6,1,2,5,3]
		self.asseryEqual(values, expected)
		
