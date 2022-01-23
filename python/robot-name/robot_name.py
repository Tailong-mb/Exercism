import random, string

class Robot:
    def __init__(self):
        self.name = self.name_me()
    def reset(self):
        self.name = self.name_me()
    def name_me(self):
        random.seed()
        letters = random.choices(string.ascii_uppercase, k=2)
        numbers = random.choices(string.digits, k=3)
        return ''.join(letters + numbers)