from User import *


class UsuarioFinal(User):

    def __init__(self):
        self.setDescription("Usuario con ciertos privilegios: ")

    def canPublish(self):
        return False

    def canComment(self):
        return False

    def canApprove(self):
        return False

    def canDelete(self):
        return False
