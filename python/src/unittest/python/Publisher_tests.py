from mockito import mock, verify, when
from User import *
from Publisher import *
import unittest

class PublisherTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def test_PublishPermission(self):
        publisher = Publisher(self.user)
        when(self.user).publishPermission().thenReturn(False)
        publisherEnabled = publisher.publishPermission()
        self.assertTrue(publisherEnabled)

    def test_Description(self):
        publisher = Publisher(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = publisher.getDescription()
        self.assertEquals("Publisher: Current user", desc)

