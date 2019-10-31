from PrivilegeDecorator import *

class Delete(PrivilegeDecorator):

    def delete(self):
        print("The user can delete.")
        return True