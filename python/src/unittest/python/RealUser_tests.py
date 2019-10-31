from mockito import mock, verify, when
import unittest
from RealUser import *

class RealUserTest(unittest.TestCase):

    def setUp(self):
        self.user = RealUser()

    def test_PublishPermission(self):
        self.assertFalse(self.user.publishPermission())

    def test_DeletionPermission(self):
        self.assertFalse(self.user.deletionPermission())

    def test_ApprovalPermission(self):
        self.assertFalse(self.user.approvalPermission())

    def test_CommentPermission(self):
        self.assertFalse(self.user.commentPermission())

