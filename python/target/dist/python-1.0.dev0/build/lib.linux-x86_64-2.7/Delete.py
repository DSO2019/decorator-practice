from PrivilegeDecorator import *


class Delete(PrivilegesDecorator):

    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return self.user.getDescription() + "delete "

    def canPublish(self):
        return self.user.canPublish()

    def canComment(self):
        return self.user.canComment()

    def canApprove(self):
        return self.user.canApprove()

    def canDelete(self):
        return True
