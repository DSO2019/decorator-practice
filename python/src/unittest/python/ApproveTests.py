from mockito import mock, verify, when
import unittest
from User import *
from Approve import *

class ApprovalTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    
    def test_ApprovalPrivilege(self):
        approval = Approval(self.user)
        when(self.user).approvePrivilege().thenReturn(False)
        approvalEnabled = approval.approvePrivilege()
        self.assertTrue(approvalEnabled)


    def test_Description(self):
        approval = Approval(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = approval.getDescription()
        self.assertEquals("Approve Privilege to: Current user", desc)
