from PrivilegeDecorator import *

class Publish(PrivilegeDecorator):

    def publish(self):
        print("The user can publish.")
        return True