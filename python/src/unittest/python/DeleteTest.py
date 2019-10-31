from mockito import mock, verify, when
from User import *
from Delete import *
import unittest


class DeleteTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def test_DeletePermission(self):
        delete = Delete(self.user)
        when(self.user).deletePermission().thenReturn(False)
        deleteAdded = delete.deletePermission()
        self.assertTrue(deleteAdded)

    def test_Description(self):
        delete = Delete(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = delete.getDescription()
        self.assertEquals("Delete permission to: Current user", desc)
