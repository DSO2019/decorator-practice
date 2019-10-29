from mockito import mock
import unittest
from main.decoratorUser import *


class MyTestCase(unittest.TestCase):

    def setUp(self):
        self.user = mock(User)

    def test_aproving(self):
        us = f"ya tienes el privilegio de aprobar"
        self.assertEqual(Approving.aprovingpriviledges(self), us)

    def test_comenting(self):
        us = f"ya tienes el privilegio de comentar"
        self.assertEqual(Comenting.comentingpriviledges(self), us)

    def test_deleting(self):
        us = f"ya tienes el privilegio de borrar"
        self.assertEqual(Deleting.deletingpriviledges(self), us)

    def test_publishing(self):
        us = f"ya tienes el privilegio de publicar"
        self.assertEqual(Publish.publishpriviledges(self), us)

