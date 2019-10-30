from User import *


class EndUser(User):

    def __init__(self, username: str):
        super().__init__(username)

    def publish(self) -> bool:
        print("No tiene el privilegio")
        return False

    def delete(self) -> bool:
        print("No tiene el privilegio")
        return False

    def aprove(self) -> bool:
        print("No tiene el privilegio")
        return False

    def comment(self) -> bool:
        print("No tiene el privilegio")
        return False
