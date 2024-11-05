# 1
class Address:
    def __init__(self, country, state, city, street, postal_code):
        # defining our constructor
        # better to put only attributes that are must needed inside constructor
        # & ignore that aren't neccesary or created later
        self.country = country
        self.state = state
        self.city = city
        self.street = street
        self.postal_code = postal_code
