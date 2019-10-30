import abc


class User:

    def __init__(self):
        self.description = "Any User"

    def getDescription(self):
        return self.description

    def setDescription(self, description):
        self.description = description

    def canPublish():
        pass

    def canComment():
        pass

    def canApprove():
        pass

    def canDelete():
        pass