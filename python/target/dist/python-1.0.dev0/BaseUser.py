from User import *

class BaseUser(User):

    def __init__(self, username):
        self.username = username

    def publish(self):
        print("No permission")
        return False

    def delete(self):
        print("No permission")
        return False

    def aprove(self):
        print("No permission")
        return False

    def comment(self):
        print("No permission")
        return False