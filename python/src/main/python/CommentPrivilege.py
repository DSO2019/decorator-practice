from PrivilegeDecorator import *


class CommentPrivilege(PrivilegeDecorator):

    def comment(self) -> bool:
        print("Comentario hecho")
        return True
