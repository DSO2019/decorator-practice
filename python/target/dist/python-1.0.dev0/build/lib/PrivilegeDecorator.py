from User import *

class PrivilegeDecorator(User):

    _user: User = None

    def __init__(self, user:User) -> None:
        self._user = user
    
    @property
    def user(self) -> str:
        return self._user
    
    
    def publish(self) -> bool:
        self._user.publish()
    
    def aprove(self) -> bool:
        self._user.aprove()
    
    def delete(self) -> bool:
        self._user.delete()
    
    def comment(self) -> bool:
        self._user.comment()