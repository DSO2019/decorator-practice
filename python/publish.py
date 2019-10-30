from PrivilegeDecorator import PrivilegeDecorator


class Publish(PrivilegeDecorator):
    PRIVILEGE = 'can publish'

    def __init__(self, newUser):
        self.user = newUser

    def getUser(self):
        return self.user

    def delete(self):
        return self.user.delete()

    def approve(self):
        return self.user.approve()

    def publish(self):
        return self.PRIVILEGE

    def comment(self):
        return self.user.comment()
