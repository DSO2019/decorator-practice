from User import *

class theUser(User):

    def publishPrivilege(self):
        print("Publishing prohibited.")
        return False

    def deletePrivilege(self):
        print("Delete prohibited.")
        return False

    def approvePrivilege(self):
        print("Approve prohibited.")
        return False

    def commentPrivilege(self):
        print("Commenting prohibited.")
        return False

