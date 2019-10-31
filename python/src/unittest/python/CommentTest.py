from mockito import mock, verify, when
from User import *
from Comment import *
import unittest


class CommentTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def test_CommentPermission(self):
        commenter = Comment(self.user)
        when(self.user).commentPermission().thenReturn(False)
        commentAdded = commenter.commentPermission()
        self.assertTrue(commentAdded)

    def test_Description(self):
        commenter = Comment(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = commenter.getDescription()
        self.assertEquals("Comment: Current user", desc)
