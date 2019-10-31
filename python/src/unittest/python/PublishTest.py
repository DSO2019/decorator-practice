from mockito import mock, verify, when
from User import *
from Publish import *
import unittest


class PublishTest(unittest.TestCase):
    def setUp(self):
        self.user = mock(User, strict=False)

    def test_PublishPermission(self):
        publish = Publish(self.user)
        when(self.user).publishPermission().thenReturn(False)
        publishAdded = publish.publishPermission()
        self.assertTrue(publishAdded)

    def test_Description(self):
        publish = Publish(self.user)
        when(self.user).getDescription().thenReturn("Current user")
        desc = publish.getDescription()
        self.assertEquals("Publish: Current user", desc)
