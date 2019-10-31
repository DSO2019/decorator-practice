
class Approval():
    def __init__(self, incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Approval permission to: " + self.user.getDescription()

    def publishPermission(self):
        return self.user.publishPermission()

    def deletionPermission(self):
        return self.user.deletionPermission()

    def approvalPermission(self):
        print("Approval permission enabled")
        return True

    def commentPermission(self):
        return self.user.commentPermission()


