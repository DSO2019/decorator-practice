package mx.iteso;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.User;
import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Comment;
 

public class CommentTest {
    private User user;
    @Before
    public void setUp(){
        user = mock((User.class));
    }
    @Test
    public void testComment(){
        User com = new Comment(user);
        when(user.canComment()).thenReturn(false);
        boolean canComment = com.canComment();
        assertTrue(canComment);
    }
    @Test
    public void testDescription(){
        User com = new Comment(user);
        when(user.getDesc()).thenReturn("User with privileges: ");
        String desc = com.getDesc();
        assertEquals("User with privileges:  comment ", desc);
    }
}