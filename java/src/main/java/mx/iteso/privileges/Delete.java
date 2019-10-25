package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.PrivilegesDecorator;

/**Borrar.*/
public class Delete extends PrivilegesDecorator {

    /**Usuario.*/
    private User user;

    /**@param usuario Usuario.*/
    public Delete(final User usuario) {
        this.user = usuario;
    }
    /**@return Descripción.*/
    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para borrar\n";
    }
}
