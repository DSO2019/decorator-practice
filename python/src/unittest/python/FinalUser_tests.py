from mockito import mock, verify, when
import unittest
from FinalUser import *


class FinalUserTest(unittest.TestCase):

    def setUp(self):
        self.user = UsuarioFinal()

    def testCanApprove(self):
        self.assertFalse(self.user.canApprove())

    def testCanComment(self):
        self.assertFalse(self.user.canComment())

    def testCanDelete(self):
        self.assertFalse(self.user.canDelete())

    def testCanPublish(self):
        self.assertFalse(self.user.canPublish())
