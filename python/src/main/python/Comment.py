
class Commenter():
    def __init__(self,incomingUser):
        self.user = incomingUser

    def getDescription(self):
        return "Commenter: " + self.user.getDescription()

    def publishPrivilege(self):
        return self.user.publishPrivilege()

    def deletePrivilege(self):
        return self.user.deletePrivilege()

    def approvePrivilege(self):
        return self.user.approvePrivilege()


    def commentPrivilege(self):
        print("Comment privilege active")
        return True
