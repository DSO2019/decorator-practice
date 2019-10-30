from PrivilegeDecorator import *

class AprovePrivilege(PrivilegeDecorator):

    def aprove(self) -> bool:
        print("Aprobación hecha")
        return True
