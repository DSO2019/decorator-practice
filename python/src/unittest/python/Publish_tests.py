from mockito import mock, verify, when
import unittest

from Publish import *
from User import *

class Publish_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = Publish(self.mockedUser)
    
    def test_publish(self):
        self.assertEqual(True, self.priv.publish())