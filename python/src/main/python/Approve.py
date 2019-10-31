
class Approval():
    def __init__(self, incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Approval privilege to: " + self.user.getDescription()

    def publishPrivilege(self):
        return self.user.publishPrivilege()

    def deletePrivilege(self):
        return self.user.deletePrivilege()

    def approvePrivilege(self):
        print("Approval privilege active")
        return True

    def commentPrivilege(self):
        return self.user.commentPrivilege()


