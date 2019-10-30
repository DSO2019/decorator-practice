from PrivilegeDecorator import *

class Edit(PrivilegeDecorator):
    def __init__(self, oldUser):
        self.user = oldUser
        self.user.getPrivileges()["edit"] = "edit"

    def getPrivileges(self):
        return self.user.getPrivileges()

    def publish(self):
        return self.user.publish()

    def delete(self):
        return self.user.delete()

    def approve(self):
        return self.user.approve()

    def edit(self):
        if "edit" in self.user.getPrivileges():
            return True
        else:
            return False