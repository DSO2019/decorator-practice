package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class PublisherPermissionTest {

    private User user;

    @Before
    public void setUp(){
        user = mock((User.class));
    }

    @Test
    public void testApprovalPermission(){
        User publisher = new BaseUser();
        publisher = new PublisherPermissions(publisher);
        when(user.canApprove()).thenReturn(false);
        when(user.canComment()).thenReturn(false);
        when(user.canDelete()).thenReturn(false);
        when(user.canPublish()).thenReturn(false);
        boolean approve = publisher.canApprove();
        boolean comment = publisher.canComment();
        boolean delete = publisher.canDelete();
        boolean publish = publisher.canPublish();
        assertTrue(!approve);
        assertTrue(!comment);
        assertTrue(!delete);
        assertTrue(publish);
    }

    @Test
    public void testDescription(){
        User publisher = new BaseUser();
        publisher = new PublisherPermissions(publisher);
        when(user.getDescription()).thenReturn("User");
        String desc = publisher.getDescription();
        assertEquals("Publisher User", desc);
    }
}