from mockito import mock, verify, when
import unittest

from User import *

class User_test(unittest.TestCase):

    def setUp(self):
        self.user = User("username")
    
    def test_getUsername(self):
        self.assertEqual("username",self.user.getUsername())
    
    def test_publish(self):
        self.assertEqual(None,self.user.publish())
    
    def test_delete(self):
        self.assertEqual(None,self.user.delete())
    
    def test_aprove(self):
        self.assertEqual(None,self.user.aprove())
    
    def test_comment(self):
        self.assertEqual(None,self.user.comment())