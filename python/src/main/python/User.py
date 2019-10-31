from abc import ABC

class User(ABC):

    def __init__(self):
        self.description = "Current user"

    def getDescription(self):
        return self.description
    
    def publishPrivilege(self):
        pass

    def deletePrivilege(self):
        pass

    def approvePrivilege(self):
        pass

    def commentPrivilege(self):
        pass

