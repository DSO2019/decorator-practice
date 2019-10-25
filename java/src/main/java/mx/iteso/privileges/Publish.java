package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.PrivilegesDecorator;

/**Publicar.*/
public class Publish extends PrivilegesDecorator {

    /**Usuario.*/
    private User user;

    /**@param usuario Usuario.*/
    public Publish(final User usuario) {
        this.user = usuario;
    }

    /**@return Descripción.*/
    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para publicar\n";
    }

}
