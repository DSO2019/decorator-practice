from PrivilegeDecorator import *

class DeletePrivilege(PrivilegeDecorator):

    def delete(self) -> bool:
        print("Eliminación hecha")
        return True