from User import User


class EndUser(User):
    def __init__(self, name):
        self.name = name
        self.setApprove("can't approve")
        self.setDelete("can't delete")
        self.setComment("can't comment")
        self.setPublish("can't publish")

    def publish(self):
        return self.getPublish()

    def comment(self):
        return self.getComment()

    def approve(self):
        return self.getApprove()

    def delete(self):
        return self.getDelete()
