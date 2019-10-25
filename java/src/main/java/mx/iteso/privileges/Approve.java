package mx.iteso.privileges;

import mx.iteso.User;
import mx.iteso.PrivilegesDecorator;

/**Aprobar.*/
public class Approve extends PrivilegesDecorator {

    /**Usuario.*/
    private User user;

    /**@param usuario Usuario.*/
    public Approve(final User usuario) {
        this.user = usuario;
    }

    /**@return Descripción.*/
    @Override
    public String getDescription() {
        return user.getDescription() + "Con permiso para aprobar\n";
    }
}
