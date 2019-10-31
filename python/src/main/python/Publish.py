
class Publisher():
    def __init__(self, incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Publisher: " + self.user.getDescription()

    def publishPrivilege(self):
        print("Publish privilege active")
        return True

    def deletePrivilege(self):
        return self.user.deletePrivilege()

    def approvePrivilege(self):
        return self.user.approvePrivilege()

    def commentPrivilege(self):
        return self.user.commentPrivilege()
