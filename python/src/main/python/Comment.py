class Comment():
    def __init__(self, user):
        self.user = user

    def getDescription(self):
        return "Comment: " + self.user.getDescription()

    def publishPermission(self):
        return self.user.publishPermission()

    def deletePermission(self):
        return self.user.deletePermission()

    def approvePermission(self):
        return self.user.approvePermission()

    def commentPermission(self):
        print("Comment permission added")
        return True
