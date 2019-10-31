from mockito import mock, verify, when
import unittest

from Aprove import *
from User import *

class Aprove_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = Aprove(self.mockedUser)
    
    def test_aprove(self):
        self.assertEqual(True, self.priv.aprove())