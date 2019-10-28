from mockito import mock, verify, when
import unittest
from User import *
from Approval import *

class ApprovalTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    
    def test_ApprovalPermission(self):
        approval = Approval(self.user)
        when(self.user).approvalPermission().thenReturn(False)
        approvalEnabled = approval.approvalPermission()
        self.assertTrue(approvalEnabled)


    def test_Description(self):
        approval = Approval(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = approval.getDescription()
        self.assertEquals("Approval permission to: Current user", desc)
