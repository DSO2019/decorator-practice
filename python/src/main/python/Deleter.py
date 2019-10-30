class Deleter():
    def __init__(self, oldUser):
        self.user = oldUser

        def getDescription(self):
            return self.user.getDescription() + " Can delete"

        def publish(self):
            return self.user.publish()

        def delete(self):
            return True

        def approve(self):
            return self.user.approve()

        def comment(self):
            return self.user.comment()
