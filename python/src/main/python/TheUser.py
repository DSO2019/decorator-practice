from User import *


class TheUser(User):

    def publishPermission(self):
        print("Publishing not allowed.")
        return False

    def deletePermission(self):
        print("Delete not allowed.")
        return False

    def approvePermission(self):
        print("Approve not allowed.")
        return False

    def commentPermission(self):
        print("Comment not allowed.")
        return False
