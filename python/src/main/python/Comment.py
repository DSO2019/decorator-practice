from PrivilegeDecorator import *


class Comment(PrivilegesDecorator):

    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return self.user.getDescription() + "comentar "

    def canPublish(self):
        return self.user.canPublish()

    def canComment(self):
        return True

    def canApprove(self):
        return self.user.canApprove()

    def canDelete(self):
        return self.user.canDelete()
