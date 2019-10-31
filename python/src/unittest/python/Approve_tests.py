from mockito import mock, verify, when
import unittest
from User import *
from Approve import *


class ApproveTest(unittest.TestCase):

    def setUp(self):
        self.user = mock(User, strict=False)

    def testCanApprove(self):
        approver = Approve(self.user)
        when(self.user).canApprove().thenReturn(False)
        canApprove = approver.canApprove()
        self.assertTrue(canApprove)

    def testDescription(self):
        approver = Approve(self.user)
        when(self.user).getDescription().thenReturn("Usuario con ciertos privilegios: ")
        desc = approver.getDescription()
        self.assertEqual("Usuario con ciertos privilegios: aprobar ", desc)
