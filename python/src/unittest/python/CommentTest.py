from mockito import mock, verify, when
from User import *
from Comment import *
import unittest

class CommentTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict = False)

    def test_CommentPrivilege(self):
        commenter = Commenter(self.user)
        when(self.user).commentPrivilege().thenReturn(False)
        commentEnabled = commenter.commentPrivilege()
        self.assertTrue(commentEnabled)

    def test_Description(self):
        commenter = Commenter(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = commenter.getDescription()
        self.assertEquals("Commenter: Current user", desc)
