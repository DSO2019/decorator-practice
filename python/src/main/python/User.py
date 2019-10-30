class User():

    def __init__(self, username: str):
        self.username = username

    def getUsername(self) -> str:
        return self.username

    def publish(self) -> bool:
        pass

    def delete(self) -> bool:
        pass

    def aprove(self) -> bool:
        pass

    def comment(self) -> bool:
        pass
