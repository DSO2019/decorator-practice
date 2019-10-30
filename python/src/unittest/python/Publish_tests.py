from mockito import mock, verify, when
import unittest
from BaseUser import *
from Publish import *

class PublishTest(unittest.TestCase):

    def setUp(self):
        self.user = BaseUser()

    def test_PublishPermission(self):
        self.user = Publish(self.user)
        self.assertTrue(self.user.publish())

    def test_DeletePermission(self):
        self.assertFalse(self.user.delete())

    def test_ApprovePermission(self):
        self.assertFalse(self.user.approve())

    def test_EditPermission(self):
        self.assertFalse(self.user.edit())
