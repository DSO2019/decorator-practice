from PrivilegeDecorator import *


class PublishPrivilege(PrivilegeDecorator):

    def publish(self) -> bool:
        print("Publicación hecha")
        return True
