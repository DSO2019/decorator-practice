from mockito import mock, verify, when
import unittest

from EndUser import * 

class EndUser_test(unittest.TestCase):

    def setUp(self):
        self.endUser = EndUser("usuario")
    
    def test_publish(self):
        self.assertEqual(False,self.endUser.publish())
    
    def test_delete(self):
        self.assertEqual(False,self.endUser.delete())
    
    def test_aprove(self):
        self.assertEqual(False,self.endUser.aprove())
    
    def test_comment(self):
        self.assertEqual(False,self.endUser.comment())