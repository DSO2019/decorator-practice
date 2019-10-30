from PrivilegeDecorator import *

class Approve(PrivilegeDecorator):
    def __init__(self, oldUser):
        self.user = oldUser
        self.user.getPrivileges()["approve"] = "approve"

    def getPrivileges(self):
        return self.user.getPrivileges()

    def publish(self):
        return self.user.publish()

    def delete(self):
        return self.user.delete()

    def approve(self):
        if "approve" in self.user.getPrivileges():
            return True
        else:
            return False

    def edit(self):
        return self.user.comment()