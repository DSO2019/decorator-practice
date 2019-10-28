
class Deletion():

    def __init__(self,incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Deletion permission to: " + self.user.getDescription()

    def publishPermission(self):
        return self.user.publishPermission()

    def deletionPermission(self):
        print("Deletion permission enabled")
        return True

    def approvalPermission(self):
        return self.user.approvalPermission()

    def commentPermission(self):
        return self.user.commentPermission()


