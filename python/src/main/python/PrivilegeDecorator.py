from User import *


class PrivilegeDecorator(User):

    user = None

    def __init__(self, user):
        self._user = user

    @property
    def user(self):
        return self._user

    def aprove(self):
        self._user.aprove()

    def comment(self):
        self._user.comment()

    def delete(self):
        self._user.delete()

    def publish(self):
        self._user.publish()
