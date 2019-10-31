from mockito import mock, verify, when
import unittest
from User import *
from Approve import *


class ApproveTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def test_ApprovePermission(self):
        approve = Approve(self.user)
        when(self.user).approvePermission().thenReturn(False)
        approveAdded = approve.approvePermission()
        self.assertTrue(approveAdded)

    def test_Description(self):
        approve = Approve(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = approve.getDescription()
        self.assertEquals("Approve permission to: Current user", desc)
