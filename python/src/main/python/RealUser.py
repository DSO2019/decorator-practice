from User import *

class RealUser(User):

    def publishPermission(self):
        print("Publishing not allowed.")
        return False

    def deletionPermission(self):
        print("Deletion not allowed.")
        return False

    def approvalPermission(self):
        print("Approval not allowed.")
        return False

    def commentPermission(self):
        print("Commenting not allowed.")
        return False

