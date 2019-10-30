from mockito import mock, verify, when
import unittest
from User import *
from Approver import *


class ApproverTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def approveTest(self):
        approver = Approver(self.user)
        when(self.user).approve().thenReturn(False)
        self.assertTrue(approver.approve())

    def commenterTest(self):
        approver = Approver(self.user)
        when(self.user).comment().thenReturn(False)
        self.assertFalse(approver.comment())

    def deleterTest(self):
        approver = Approver(self.user)
        when(self.user).delete().thenReturn(False)
        self.assertFalse(approver.delete())

    def publisherTest(self):
        approver = Approver(self.user)
        when(self.user).publish().thenReturn(False)
        self.assertFalse(approver.publish())

    def getDescriptionTest(self):
        approver = Approval(self.user)
        when(self.user).getDescription().thenReturn("User >")
        self.assertEquals("User > Can approve", approver.getDescription())
