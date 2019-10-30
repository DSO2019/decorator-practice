from mockito import mock, verify, when
import unittest

from DeletePrivilege import *
from User import *

class DeletePrivilege_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = DeletePrivilege(self.mockedUser)
    
    def test_delete(self):
        self.assertEqual(True, self.priv.delete())