package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ElMaligno666 on October 2019.
 */
public class PublishTest {
    private User user;

    
    @Before
    public void setUp() {
        user = new FinalUser();
    }

    @Test
    public void testPublish() {
        assertEquals(user.publish(), "No tengo privilegios para publicar");
        this.user = new Publish(this.user);
        assertEquals(user.publish(), "Puedo publicar");  
    }

}
