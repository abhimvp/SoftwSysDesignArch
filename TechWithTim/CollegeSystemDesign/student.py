# 3

from person import Person
from enrollment import Enrollment


class Student(Person):
    def __init__(
        self,
        first_name,
        last_name,
        date_of_birth,
        phone_number,
        address,
        international=False,
    ):
        super().__init__(first_name, last_name, date_of_birth, phone_number, address)
        self.international = international
        self.enrolled = []

    def add_enrollment(self, enrollment):
        if not isinstance(enrollment, Enrollment):
            raise ValueError("Invalid Enrollment...")

        self.enrolled.append(enrollment)
    
    def is_on_probation(self):
        return False

    def is_part_time(self):
        return len(self.enrolled) <= 2