from PrivilegeDecorator import PrivilegeDecorator


class Delete(PrivilegeDecorator):
    PRIVILEGE = 'can delete'

    def __init__(self, newUser):
        self.user = newUser

    def getUser(self):
        return self.user

    def delete(self):
        return self.PRIVILEGE

    def approve(self):
        return self.user.approve()

    def publish(self):
        return self.user.publish()

    def comment(self):
        return self.user.comment()
