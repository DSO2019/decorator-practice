from mockito import mock, verify, when
import unittest
from User import *
from Publish import *


class PublishTest(unittest.TestCase):

    def setUp(self):
        self.user = mock(User, strict=False)

    def testCanPublish(self):
        publisher = Publish(self.user)
        when(self.user).canPublish().thenReturn(False)
        canPublish = publisher.canPublish()
        self.assertTrue(canPublish)

    def testDescription(self):
        publisher = Publish(self.user)
        when(self.user).getDescription().thenReturn("Usuario con ciertos privilegios: ")
        desc = publisher.getDescription()
        self.assertEqual("Usuario con ciertos privilegios: publicar ", desc)
