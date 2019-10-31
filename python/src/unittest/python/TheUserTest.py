from mockito import mock, verify, when
import unittest
from TheUser import *


class TheUserTest(unittest.TestCase):

    def setUp(self):
        self.user = TheUser()

    def test_PublishPermission(self):
        self.assertFalse(self.user.publishPermission())

    def test_DeletePermission(self):
        self.assertFalse(self.user.deletePermission())

    def test_ApprovePermission(self):
        self.assertFalse(self.user.approvePermission())

    def test_CommentPermission(self):
        self.assertFalse(self.user.commentPermission())
