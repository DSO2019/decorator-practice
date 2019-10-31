from mockito import mock, verify, when
from User import *
from Delete import *
import unittest


class DeletionTest(unittest.TestCase):
    def setUp(self):
       self.user = mock(User, strict = False)

    def test_DeletePrivilege(self):
        delete = Delete(self.user)
        when(self.user).DeletePermission().thenReturn(False)
        deleteEnabled = Delete.DeletePermission()
        self.assertTrue(deleteEnabled)
    
    def test_Description(self):
        delete = Delete(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = Delete.getDescription()
        self.assertEquals("Delete privilege to: Current user", desc)

