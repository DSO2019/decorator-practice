from PrivilegeDecorator import *


class Approve(PrivilegesDecorator):

    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return self.user.getDescription() + "aprobar "

    def canPublish(self):
        return self.user.canPublish()

    def canComment(self):
        return self.user.canComment()

    def canApprove(self):
        return True

    def canDelete(self):
        return self.user.canDelete()
