from abc import ABC

class User(ABC):

    def __init__(self):
        self.description = "User >"

    def getDescription(self):
        return self.description
    
    def publish(self):
        pass

    def delete(self):
        pass

    def approve(self):
        pass

    def comment(self):
        pass