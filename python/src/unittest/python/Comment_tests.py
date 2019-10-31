from mockito import mock, verify, when
import unittest
from User import *
from Comment import *


class CommentTest(unittest.TestCase):

    def setUp(self):
        self.user = mock(User, strict=False)

    def testCanComment(self):
        commenter = Comment(self.user)
        when(self.user).canComment().thenReturn(False)
        canComment = commenter.canComment()
        self.assertTrue(canComment)

    def testDescription(self):
        commenter = Comment(self.user)
        when(self.user).getDescription().thenReturn("Usuario con ciertos privilegios: ")
        desc = commenter.getDescription()
        self.assertEqual("Usuario con ciertos privilegios: comentar ", desc)
