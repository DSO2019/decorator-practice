package mx.iteso;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class FinalUserTest {
    @Test
    public void testCanApprove() {
        User user = new FinalUser();
        assertFalse(user.canApprove());
    }

    @Test
    public void testCanComment() {
        User user = new FinalUser();
        assertFalse(user.canComment());
    }

    @Test
    public void testCanDelete() {
        User user = new FinalUser();
        assertFalse(user.canDelete());
    }

    @Test
    public void testCanPublish() {
        User user = new FinalUser();
        assertFalse(user.canPublish());
    }
}