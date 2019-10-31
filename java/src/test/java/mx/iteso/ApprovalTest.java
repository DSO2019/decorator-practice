package mx.iteso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

/** Approval Test Class. */
public class ApprovalTest {
    /** User to be mocked. */
    private User user;
    
    /** Setup mehtod. */
    @Before
    public void setUp(){
        user = mock((User.class));
    }

    /** Method that proves the approval permission. */
    @Test
    public void testApprovalPermission(){
        User approval = new Approval(user);
        when(user.approvalPermission()).thenReturn(false);
        boolean approvalEnabled = approval.approvalPermission();
        assertTrue(approvalEnabled);
    }

    /** Method that tests the description on approval test. */
    @Test
    public void testDescription(){
        User approval = new Approval(user);
        when(user.getDescription()).thenReturn("Current user");
        String desc = approval.getDescription();
        assertEquals("Approval permission to: Current user", desc);
    }
}
