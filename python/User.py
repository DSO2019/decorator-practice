class User:

    name = 'My name'
    publishPemission = ''
    commentPermission = ''
    deletePermission = ''
    approvePermission = ''

    def __init__(self):
        pass

    def getName(self):
        return self.name

    def setName(self, newName):
        self.name = newName

    def getPublish(self):
        return self.publishPemission

    def setPublish(self, permission):
        self.publishPemission = permission

    def getComment(self):
        return self.commentPermission

    def setComment(self, permission):
        self.commentPermission = permission

    def getApprove(self):
        return self.approvePermission

    def setApprove(self, permission):
        self.approvePermission = permission

    def getDelete(self):
        return self.deletePermission

    def setDelete(self, permission):
        self.deletePermission = permission

    def delete(self):
        pass

    def publish(self):
        pass

    def approve(self):
        pass

    def comment(self):
        pass
