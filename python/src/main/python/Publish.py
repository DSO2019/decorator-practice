class Publish():
    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return "Publish: " + self.user.getDescription()

    def publishPermission(self):
        print("Publish permission added")
        return True

    def deletePermission(self):
        return self.user.deletePermission()

    def approvePermission(self):
        return self.user.approvePermission()

    def commentPermission(self):
        return self.user.commentPermission()
