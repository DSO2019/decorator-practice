class Commenter():
    def __init__(self, oldUser):
        self.user = oldUser

        def getDescription(self):
            return self.user.getDescription() + " Can comment"
        def publish(self):
            return self.user.publish()
        def delete(self):
            return self.user.delete()
        def approve(self):
            return self.user.approve()
        def comment(self):
            return True
        