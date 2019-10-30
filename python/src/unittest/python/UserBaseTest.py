from mockito import mock, verify, when
import unittest
from UserBase import *


class UserBaseTest(unittest.TestCase):

    def setUp(self):
        self.user = UserBase()

    def approveTest(self):
        self.assertFalse(self.user.approve())

    def commenterTest(self):
        self.assertFalse(self.user.comment())

    def deleterTest(self):
        self.assertFalse(self.user.delete())

    def publisherTest(self):
        self.assertFalse(self.user.publish())

    def testDescription(self):
        self.assertEquals("User >", self.user.getDescription())
