from mockito import mock, verify, when
from User import *
from Commenter import *
import unittest

class CommenterTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict = False)

    def test_CommentPermission(self):
        commenter = Commenter(self.user)
        when(self.user).commentPermission().thenReturn(False)
        commentEnabled = commenter.commentPermission()
        self.assertTrue(commentEnabled)

    def test_Description(self):
        commenter = Commenter(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = commenter.getDescription()
        self.assertEquals("Commenter: Current user", desc)
