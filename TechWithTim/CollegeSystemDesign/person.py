# 2
# Req: a person can have atleast one or multiple addresses
from address import Address


class Person:
    def __init__(self, first_name, last_name, date_of_birth, phone_number, address):
        self.first_name = first_name
        self.last_name = last_name
        self.date_of_birth = date_of_birth
        self.phone_number = phone_number
        self.addresses = []

        if isinstance(address, Address):
            self.addresses.append(address)
        elif isinstance(address, list):
            for entry in address:
                if not isinstance(entry, Address):
                    raise ValueError("Invalid Address...")
            self.addresses = address
        else:
            raise ValueError("Invalid Address...")

    def add_address(self, address):
        if not isinstance(address, Address):
            raise ValueError("Invalid Address...")

        self.addresses.append(address)
