package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import mx.iteso.privileges.Comment;

public class CommentTest {
    private User user;
    
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    @Test
    public void testCanComment(){
        User commenter = new Comment(user);
        when(user.canComment()).thenReturn(false);
        boolean canComment = commenter.canComment();
        assertTrue(canComment);
    }

    @Test
    public void testDescription(){
        User commenter = new Comment(user);
        when(user.getDescription()).thenReturn("User with privileges: ");
        String desc = commenter.getDescription();
        assertEquals("User with privileges: comment ", desc);
    }
}