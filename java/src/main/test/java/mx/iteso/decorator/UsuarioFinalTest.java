package mx.iteso.decorator;

import mx.iteso.User;
import mx.iteso.UsuarioFinal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioFinalTest {
    @Test
    public void ApprovingTest(){
        User user = new UsuarioFinal();
        assertEquals("no tienes privilegio de aprovar",user.approvingPriviledgeUser());
    }
    @Test
    public void CommentingTest(){
        User user = new UsuarioFinal();
        assertEquals("no tienes privilegio de comentar",user.commentingPriviledgeUser());
    }
    @Test
    public void DeletingTest(){
        User user = new UsuarioFinal();
        assertEquals("no tienes privilegio de borrar",user.deletingPriviledgeUser());
    }
    @Test
    public void PublisherTest(){
        User user = new UsuarioFinal();
        assertEquals("no tienes privilegio de publicar",user.publisherPriviledgeUser());
    }
    @Test
    public void DescriptionTest(){
        User user = new UsuarioFinal();
        assertEquals("No tienes privilegios",user.getPriviledges());
    }
}
