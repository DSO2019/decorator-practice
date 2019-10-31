package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ElMaligno666 on October 2019.
 */
public class FinalUserTest {
    private User user;

    
    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testFinalUser() {
        assertEquals(user.delete(), "No tengo privilegios para borrar");
        assertEquals(user.publish(), "No tengo privilegios para publicar");
        assertEquals(user.comment(), "No tengo privilegios para comentar");
        assertEquals(user.approve(), "No tengo privilegios para aprobar");
        this.user = new Delete(this.user);
        assertEquals(user.delete(), "Puedo borrar");  
        this.user = new Publish(this.user);
        assertEquals(user.publish(), "Puedo publicar");  
        this.user = new Comment(this.user);
        assertEquals(user.comment(), "Puedo comentar");  
        this.user = new Approve(this.user);
        assertEquals(user.approve(), "Puedo aprobar");  
    }

}
