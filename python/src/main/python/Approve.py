class Approve():
    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return "Approve permission to: " + self.user.getDescription()

    def publishPermission(self):
        return self.user.publishPermission()

    def deletePermission(self):
        return self.user.deletePermission()

    def approvePermission(self):
        print("Approve permission added")
        return True

    def commentPermission(self):
        return self.user.commentPermission()
