from mockito import mock, verify, when
import unittest
from User import *
from Publisher import *


class PublisherTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def approveTest(self):
        publisher = Publisher(self.user)
        when(self.user).approve().thenReturn(False)
        self.assertFalse(publisher.approve())

    def commenterTest(self):
        publisher = Publisher(self.user)
        when(self.user).comment().thenReturn(False)
        self.assertFalse(publisher.comment())

    def deleterTest(self):
        publisher = Publisher(self.user)
        when(self.user).delete().thenReturn(False)
        self.assertFalse(publisher.delete())

    def publisherTest(self):
        publisher = Publisher(self.user)
        when(self.user).publish().thenReturn(False)
        self.assertTrue(publisher.publish())

    def getDescriptionTest(self):
        publisher = Approval(self.user)
        when(self.user).getDescription().thenReturn("User >")
        self.assertEquals("User > Can publish", publisher.getDescription())
