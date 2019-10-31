package mx.iteso.test;

import mx.iteso.NewUser;
import mx.iteso.User;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Test class to create new users.
 */
public class TestNewUser {
    /**
     * new user.
     */
    @Test
    public void testCanApprove() {
        User user = new NewUser();
        assertFalse(user.canApprove());
    }

    /**
     * permiso de comentar.
     */
    @Test
    public void testCanComment() {
        User user = new NewUser();
        assertFalse(user.canComment());
    }

    /**
     * prmiso de eliminar.
     */
    @Test
    public void testCanDelete() {
        User user = new NewUser();
        assertFalse(user.canDelete());
    }

    /**
     * permiso de publicar.
     */
    @Test
    public void testCanPublish() {
        User user = new NewUser();
        assertFalse(user.canPublish());
    }
}
