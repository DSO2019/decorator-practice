from PrivilegeDecorator import *


class Publish(PrivilegesDecorator):

    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return self.user.getDescription() + "publish "

    def canPublish(self):
        return True

    def canComment(self):
        return self.user.canComment()

    def canApprove(self):
        return self.user.canApprove()

    def canDelete(self):
        return self.user.canDelete()
