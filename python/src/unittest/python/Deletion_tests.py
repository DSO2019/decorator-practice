from mockito import mock, verify, when
from User import *
from Deletion import *
import unittest

class DeletionTest(unittest.TestCase):
    def setUp(self):
       self.user = mock(User, strict = False)

    def test_DeletionPermission(self):
        deletion = Deletion(self.user)
        when(self.user).deletionPermission().thenReturn(False)
        deletionEnabled = deletion.deletionPermission()
        self.assertTrue(deletionEnabled)
    
    def test_Description(self):
        deletion = Deletion(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = deletion.getDescription()
        self.assertEquals("Deletion permission to: Current user", desc)

