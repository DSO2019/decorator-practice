from PrivilegeDecorator import *

class Aprove(PrivilegeDecorator):

    def aprove(self):
        print("The user can aprove.")
        return True