from mockito import mock, verify, when
from User import *
from Publish import *
import unittest

class PublisherTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def test_PublishPrivilege(self):
        publisher = Publisher(self.user)
        when(self.user).publishPrivilege().thenReturn(False)
        publisherEnabled = publisher.publishPrivilege()
        self.assertTrue(publisherEnabled)

    def test_Description(self):
        publisher = Publisher(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = publisher.getDescription()
        self.assertEquals("Publisher: Current user", desc)

