from PrivilegeDecorator import *

class Publish(PrivilegeDecorator):
    def __init__(self, oldUser):
        self.user = oldUser
        self.user.getPrivileges()["publish"] = "publish"

    def getPrivileges(self):
        return self.user.getPrivileges()

    def publish(self):
        if "publish" in self.user.getPrivileges():
            return True
        else:
            return False

    def delete(self):
        return self.user.delete()

    def approve(self):
        return self.user.approve()

    def edit(self):
        return self.user.edit()