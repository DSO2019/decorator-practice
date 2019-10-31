class Delete():

    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return "Delete permission to: " + self.user.getDescription()

    def publishPermission(self):
        return self.user.publishPermission()

    def deletePermission(self):
        print("Delete permission added")
        return True

    def approvePermission(self):
        return self.user.approvePermission()

    def commentPermission(self):
        return self.user.commentPermission()
