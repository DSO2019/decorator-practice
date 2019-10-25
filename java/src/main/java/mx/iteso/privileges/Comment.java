package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.PrivilegesDecorator;

/**Comentar.*/
public class Comment extends PrivilegesDecorator {

    /**Usuario.*/
    private User user;

    /**@param usuario Usuario.*/
    public Comment(final User usuario) {
        this.user = usuario;
    }

    /**@return Descripción.*/
    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para comentar\n";
    }

}
