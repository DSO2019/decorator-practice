from PrivilegeDecorator import *


class Comment(PrivilegeDecorator):

    def comment(self):
        print("The user can comment.")
        return True
