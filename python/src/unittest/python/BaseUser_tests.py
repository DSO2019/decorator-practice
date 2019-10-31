from mockito import mock, verify, when
import unittest

from BaseUser import * 

class BaseUser_test(unittest.TestCase):

    def setUp(self):
        self.baseUser = BaseUser("user")
    
    def test_publish(self):
        self.assertEqual(False,self.baseUser.publish())
    
    def test_delete(self):
        self.assertEqual(False,self.baseUser.delete())
    
    def test_aprove(self):
        self.assertEqual(False,self.baseUser.aprove())
    
    def test_comment(self):
        self.assertEqual(False,self.baseUser.comment())