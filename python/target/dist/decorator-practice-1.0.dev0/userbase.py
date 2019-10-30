from User import *

class UserBase(User):

    def publish(self):
        return False

    def delete(self):
        return False

    def approve(self):
        return False

    def comment(self):
        return False