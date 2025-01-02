from unittest import TestCase
import studentgrade

class StudentGrade(TestCase):
	def test_if_getEachStudentTotal_exist(self):
		value = studentgrade.getEachStudentTotal(["maths","english"], {"malik":{"maths":56},"jame":{"english":45}})

	def test_if_getEachStudentTotal_returns_a_list(self):
		value = studentgrade.getEachStudentTotal(["maths","english"] , {malik:{maths:56,english:50},james:{"maths":30 , "english":45}})
		expected = [106, 75]
		self.assertEqual(value,expected)

	def test_if_getPosition_exist(self):
		studentgrade.getPosition([23,4,5,67,9])

	def test_if_getPosition_will_return_a_value(self):
		value = studentgrade.getPosition([23,4,5,67,9])
		expected = [6,1,2,5,3]
		self.assertEqual(value, expected)	
	def test_if_getPosition_will_return_a_list(self):
		value = studentgrade.getPosition([23,4,5,67,9])
		expected = [6,1,2,5,3]
		self.assertEqual(value,expected)
	
	def test_if_subjectTotal_exist(self):
		 studentgrade.subjectTotal({"malik":{"maths":56,"english":45},"jame":{"maths":45,"english":45}})
	def test_if_subjectTotal_returns_an_int_value(self):
		value = studentgrade.subjectTotal({"malik":{"maths":56,"english":45},"jame":{"maths":45,"english":45}})
		expected = [101, 90]
		self.assertEqual(value,expected)
	def test_if_subjectTotal_returns_an_correct_t_value(self):
		value = studentgrade.subjectTotal({"malik":{"maths":56,"english":45},"jame":{"maths":45,"english":45}})
		expected = [101, 90]
		self.assertEqual(value,expected)

	def test_if_passesAndFailures_exist_(self):
		studentgrade.passesAndFailures({"malik":{"maths":56,"english":43},"jame":{"maths":43,"english":43}}, (["maths","english"])
	def test_if_passesAndFailures_returns_an_int_value_(self):
		values = studentgrade.passesAndFailures({"malik":{"maths":56,"english":43},"jame":{"maths":43,"english":43}}, (["maths","english"])
		expected = [1,1],[0,2]
		self.assertEqual(value,expected)
			def test_if_passesAndFailures_returns_a_correct_value_(self):
		values = studentgrade.passesAndFailures({"malik":{"maths":56,"english":43},"jame":{"maths":43,"english":43}}, (["maths","english"])
		expected = [1,1],[0,2]
		self.assertEqual(value,expected)
		
	def test_if_overall_highest_score_exist(self):
		studentgrade.overall_highest_score({"malik":{"maths":56,"english":43},"jame":{"maths":43,"english":43}})
	def test_will return_an_int__value()
		value = studentgrade.overall_highest_score({"malik":{"maths":56,"english":43},"jame":{"maths":43,"english":43}})
		expected = 56, maths, malik
		self.assertEqual(value,expected)
	def test_will return_a_correct_value()
		value = studentgrade.overall_highest_score({"malik":{"maths":56,"english":93},"jame":{"maths":43,"english":43}})
		expected = 93, english, malik
		self.assertEqual(value,expected)