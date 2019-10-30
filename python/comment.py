from PrivilegeDecorator import PrivilegeDecorator


class Comment(PrivilegeDecorator):
    PRIVILEGE = 'can comment'

    def __init__(self, newUser):
        self.user = newUser

    def getUser(self):
        return self.user

    def delete(self):
        return self.user.delete()

    def approve(self):
        return self.user.approve()

    def publish(self):
        return self.user.publish()

    def comment(self):
        return self.PRIVILEGE
