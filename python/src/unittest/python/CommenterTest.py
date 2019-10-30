from mockito import mock, verify, when
import unittest
from User import *
from Commenter import *


class CommenterTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def approveTest(self):
        commenter = Commenter(self.user)
        when(self.user).approve().thenReturn(False)
        self.assertFalse(commenter.approve())

    def commenterTest(self):
        commenter = Commenter(self.user)
        when(self.user).comment().thenReturn(False)
        self.assertTrue(commenter.comment())

    def deleterTest(self):
        commenter = Commenter(self.user)
        when(self.user).delete().thenReturn(False)
        self.assertFalse(commenter.delete())

    def publisherTest(self):
        commenter = Commenter(self.user)
        when(self.user).publish().thenReturn(False)
        self.assertFalse(commenter.publish())

    def getDescriptionTest(self):
        commenter = Approval(self.user)
        when(self.user).getDescription().thenReturn("User >")
        self.assertEquals("User > Can comment", commenter.getDescription())
