class Approver():
    def __init__(self, oldUser):
        self.user = oldUser

        def getDescription(self):
            return self.user.getDescription() + " Can approve"

        def publish(self):
            return self.user.publish()

        def delete(self):
            return self.user.delete()

        def approve(self):
            return True

        def comment(self):
            return self.user.comment()
