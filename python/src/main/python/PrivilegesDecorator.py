from User import *
from abc import abstractmethod


class PrivilegesDecorator(User):
    @abstractmethod
    def getDescription(self):
        pass
