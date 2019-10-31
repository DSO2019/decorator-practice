package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ElMaligno666 on October 2019.
 */
public class DeleteTest {
    private User user;

    
    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testDelete() {
        assertEquals(user.delete(), "No tengo privilegios para borrar");
        this.user = new Delete(this.user);
        assertEquals(user.delete(), "Puedo borrar");  
    }

}
