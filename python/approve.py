from PrivilegeDecorator import PrivilegeDecorator


class Approve(PrivilegeDecorator):
    PRIVILEGE = 'can approve'

    def __init__(self, newUser):
        self.user = newUser

    def getUser(self):
        return self.user

    def delete(self):
        return self.user.delete()

    def approve(self):
        return self.PRIVILEGE

    def publish(self):
        return self.user.publish()

    def comment(self):
        return self.user.comment()
