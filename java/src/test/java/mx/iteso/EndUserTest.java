package mx.iteso;


import mx.iteso.privileges.Approve;
import mx.iteso.privileges.Comment;
import mx.iteso.privileges.Delete;
import mx.iteso.privileges.Publish;
import mx.iteso.users.EndUser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class EndUserTest {
    private EndUser mockedEndUser;

    @Before
    public void setUp() {
        mockedEndUser = mock(EndUser.class);
    }

    @Test
    public void approveTest() {
        Approve approvePermission = new Approve(mockedEndUser);
        assertEquals("can approve", approvePermission.approve());
    }

    @Test
    public void publishTest() {
        Publish publishPermission = new Publish(mockedEndUser);
        assertEquals("can publish", publishPermission.publish());
    }

    @Test
    public void commentTest() {
        Comment commentPermission = new Comment(mockedEndUser);
        assertEquals("can comment", commentPermission.comment());
    }

    @Test
    public void deleteTest() {
        Delete deletePermission = new Delete(mockedEndUser);
        assertEquals("can delete", deletePermission.delete());
    }
}
