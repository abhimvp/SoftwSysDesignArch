from professor import Professor
from enrollment import Enrollment


class Course:
    def __init__(self, course_name, course_code, max_students, min_students, professor):
        self.course_name = course_name
        self.course_code = course_code
        self.max_students = max_students
        self.min_students = min_students
        self.professors = []
        self.enrollments = []

        if isinstance(professor, Professor):
            self.professors.append(professor)
        elif isinstance(professor, list):
            for entry in professor:
                if not isinstance(entry, Professor):
                    raise ValueError("Invalid Professor...")
            self.professors = professor
        else:
            raise ValueError("Invalid Professor...")
        
    def add_professor(self, professor):
        if not isinstance(professor, Professor):
            raise ValueError("Invalid Professor...")

        self.professors.append(professor)
    
    def add_enrollment(self, enrollment):
        if not isinstance(enrollment, Enrollment):
            raise ValueError("Invalid Enrollment...")

        if len(self.enrollments) == self.max_students:
            raise ValueError("Cannot enroll, course is full...")

        self.enrollments.append(enrollment)
    
    def is_cancelled(self):
        return len(self.enrollments) < self.min_students
