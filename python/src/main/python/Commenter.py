
class Commenter():
    def __init__(self,incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Commenter: " + self.user.getDescription()

    def publishPermission(self):
        return self.user.publishPermission()

    def deletionPermission(self):
        return self.user.deletionPermission()

    def approvalPermission(self):
        return self.user.approvalPermission()


    def commentPermission(self):
        print("Commenting permission enabled")
        return True
