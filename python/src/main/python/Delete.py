from PrivilegeDecorator import *

class Delete(PrivilegeDecorator):
    def __init__(self, oldUser):
        self.user = oldUser
        self.user.getPrivileges()["delete"] = "delete"

    def getPrivileges(self):
        return self.user.getPrivileges()

    def publish(self):
        return self.user.publish()

    def delete(self):
        if "delete" in self.user.getPrivileges():
            return True
        else:
            return False

    def approve(self):
        return self.user.approve()

    def edit(self):
        return self.user.edit()