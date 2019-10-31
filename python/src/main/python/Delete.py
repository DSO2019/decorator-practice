
class Delete():

    def __init__(self,incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Delete privilege to: " + self.user.getDescription()

    def publishPrivilege(self):
        return self.user.publishPrivilege()

    def deletePrivilege(self):
        print("Delete privilege active")
        return True

    def approvePrivilege(self):
        return self.user.approvePrivilege()

    def commentPrivilege(self):
        return self.user.commentPrivilege()


