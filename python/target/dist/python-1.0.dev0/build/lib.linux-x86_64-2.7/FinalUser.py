from User import *


class FinalUser(User):

    def __init__(self):
        self.setDescription("User with privileges: ")

    def canPublish(self):
        return False

    def canComment(self):
        return False

    def canApprove(self):
        return False

    def canDelete(self):
        return False
