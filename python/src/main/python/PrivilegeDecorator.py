from User import *
from abc import abstractmethod


class PrivilegeDecorator(User):
    @abstractmethod
    def getDescription(self):
        pass
