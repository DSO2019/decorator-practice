from mockito import mock, verify, when
import unittest

from PublishPrivilege import *
from User import *

class PublishPrivilege_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = PublishPrivilege(self.mockedUser)
    
    def test_publish(self):
        self.assertEqual(True, self.priv.publish())