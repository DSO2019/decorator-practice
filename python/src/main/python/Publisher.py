
class Publisher():
    def __init__(self, incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Publisher: " + self.user.getDescription()

    def publishPermission(self):
        print("Publish permission enabled")
        return True

    def deletionPermission(self):
        return self.user.deletionPermission()

    def approvalPermission(self):
        return self.user.approvalPermission()

    def commentPermission(self):
        return self.user.commentPermission()
