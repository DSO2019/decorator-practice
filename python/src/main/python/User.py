from abc import ABC


class User(ABC):

    def __init__(self):
        self.description = "Current user"

    def getDescription(self):
        return self.description

    def publishPermission(self):
        pass

    def deletePermission(self):
        pass

    def approvePermission(self):
        pass

    def commentPermission(self):
        pass
