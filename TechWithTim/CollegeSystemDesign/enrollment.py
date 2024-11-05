from student import Student
from course import Course
from datetime import datetime
class Enrollment:
    def __init__(self, student,course):
        if not isinstance(student, Student):
            raise ValueError("Invalid Student...")
        if not isinstance(course, Course):
            raise ValueError("Invalid Course...")
        self.student = student
        self.course = course
        self.grade = None
        self.date = datetime.now()
    
    def set_grade(self,grade):
        self.grade=grade
        