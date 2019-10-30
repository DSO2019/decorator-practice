from mockito import mock, verify, when
import unittest
from User import *
from Deleter import *


class DeleterTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def approveTest(self):
        deleter = Deleter(self.user)
        when(self.user).approve().thenReturn(False)
        self.assertFalse(deleter.approve())

    def commenterTest(self):
        deleter = Deleter(self.user)
        when(self.user).comment().thenReturn(False)
        self.assertFalse(deleter.comment())

    def deleterTest(self):
        deleter = Deleter(self.user)
        when(self.user).delete().thenReturn(False)
        self.assertTrue(deleter.delete())

    def publisherTest(self):
        deleter = Deleter(self.user)
        when(self.user).publish().thenReturn(False)
        self.assertFalse(deleter.publish())

    def getDescriptionTest(self):
        deleter = Approval(self.user)
        when(self.user).getDescription().thenReturn("User >")
        self.assertEquals("User > Can delete", deleter.getDescription())
