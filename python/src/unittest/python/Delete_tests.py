from mockito import mock, verify, when
import unittest
from User import *
from Delete import *


class DeleteTest(unittest.TestCase):

    def setUp(self):
        self.user = mock(User, strict=False)

    def testCanDelete(self):
        deleter = Delete(self.user)
        when(self.user).canDelete().thenReturn(False)
        canDelete = deleter.canDelete()
        self.assertTrue(canDelete)

    def testDescription(self):
        deleter = Delete(self.user)
        when(self.user).getDescription().thenReturn("User with privileges: ")
        desc = deleter.getDescription()
        self.assertEqual("User with privileges: delete ", desc)
