from mockito import mock, verify, when
import unittest

from PrivilegeDecorator import *
from User import * 

class PrivilegeDecorator_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = PrivilegeDecorator(self.mockedUser)
    
    def test_user(self):
        self.assertEqual(None,self.priv.user())
    
