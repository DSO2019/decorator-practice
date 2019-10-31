from mockito import mock, verify, when
import unittest

from Delete import *
from User import *

class Delete_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = Delete(self.mockedUser)
    
    def test_delete(self):
        self.assertEqual(True, self.priv.delete())