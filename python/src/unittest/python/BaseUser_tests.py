from mockito import mock, verify, when
import unittest
from BaseUser import *

class BaseUserTest(unittest.TestCase):

    def setUp(self):
        self.user = BaseUser()

    def test_PublishPermission(self):
        self.assertFalse(self.user.publish())

    def test_DeletePermission(self):
        self.assertFalse(self.user.delete())

    def test_ApprovePermission(self):
        self.assertFalse(self.user.approve())

    def test_EditPermission(self):
        self.assertFalse(self.user.edit())
