from mockito import mock, verify, when
import unittest

from Comment import *
from User import *

class CommentPrivilege_test(unittest.TestCase):

    def setUp(self):
        self.mockedUser = mock(User, strict=False)
        self.priv = Comment(self.mockedUser)
    
    def test_comment(self):
        self.assertEqual(True, self.priv.comment())