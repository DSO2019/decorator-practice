from mockito import mock, verify, when
import unittest
from theUser import *

class theUser(unittest.TestCase):

    def setUp(self):
        self.user = theUser()

    def test_PublishPrivilege(self):
        self.assertFalse(self.user.publishPrivilege())

    def test_DeletionPrivilege(self):
        self.assertFalse(self.user.deletePrivilege())

    def test_ApprovalPrivilege(self):
        self.assertFalse(self.user.approvePrivilege())

    def test_CommentPermission(self):
        self.assertFalse(self.user.commentPrivilege())

