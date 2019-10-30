class Publisher():
    def __init__(self, oldUser):
        self.user = oldUser

        def getDescription(self):
            return self.user.getDescription() + " Can publish"

        def publish(self):
            return True

        def delete(self):
            return self.user.delete()

        def approve(self):
            return self.user.approve()

        def comment(self):
            return self.user.comment()
