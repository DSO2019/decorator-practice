from abc import ABC

class User(ABC):

    def __init__(self):
        self.description = "Current user"

    def getDescription(self):
        return self.description
    
    def publishPermission(self):
        pass

    def deletionPermission(self):
        pass

    def approvalPermission(self):
        pass

    def commentPermission(self):
        pass

