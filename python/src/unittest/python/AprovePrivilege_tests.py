from mockito import mock, verify, when
import unittest

from AprovePrivilege import *
from User import *

class AprovePrivilege_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = AprovePrivilege(self.mockedUser)
    
    def test_aprove(self):
        self.assertEqual(True, self.priv.aprove())